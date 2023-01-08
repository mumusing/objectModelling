package com.low.design.patterns.command.activity1;

public class EmailJob implements Job{

    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public void run() {

        System.out.println("Job ID: " + Thread.currentThread().getId() +" executing Email Job");

        if (email != null) {
            email.sendEmail();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

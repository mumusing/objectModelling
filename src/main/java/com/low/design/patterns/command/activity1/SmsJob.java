package com.low.design.patterns.command.activity1;

public class SmsJob implements Job {

    private Sms sms;

    public void setSmsJob(Sms sms) {
        this.sms = sms;
    }

    @Override
    public void run() {
        System.out.println("Job ID: "+Thread.currentThread().getId()+" executing sms jobs. ");
        if (sms != null) {
            sms.sendSms();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

package com.low.design.patterns.command.notes;

public class FileJob implements Job{

    private File file;

    public void  setFileJob(File file) {
        this.file = file;
    }

    @Override
    public void run() {

        System.out.println("Job ID: " + Thread.currentThread().getId() + " executing fileIO jobs");
        if (file != null) {
            file.execute();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

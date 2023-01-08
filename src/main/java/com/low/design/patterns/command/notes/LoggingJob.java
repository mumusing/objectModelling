package com.low.design.patterns.command.notes;

public class LoggingJob implements Job {

    private Logging logging;

    public void setLoggingJob(Logging logging) {
        this.logging = logging;
    }

    @Override
    public void run() {
        System.out.println("Job ID: "+Thread.currentThread().getId()+" executing logging jobs. ");

        if (logging!=null) {
            logging.log();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package com.low.design.patterns.command.activity1;

public class Main {

    public static void main(String[] args) {
        init();
    }

    private static void init() {

        ThreadPool threadPool = new ThreadPool(10);

        Email email = null;
        EmailJob emailJob = new EmailJob();

        Sms sms = null;
        SmsJob smsJob = new SmsJob();

        File file = null;
        FileJob fileJob = new FileJob();

        Logging logging = null;
        LoggingJob loggingJob = new LoggingJob();

        for (int i = 0; i < 5; i++) {

            email = new Email();
            emailJob.setEmail(email);

            sms = new Sms();
            smsJob.setSmsJob(sms);

            file = new File();
            fileJob.setFileJob(file);

            logging = new Logging();
            loggingJob.setLoggingJob(logging);

            threadPool.addJob(emailJob);
            threadPool.addJob(smsJob);
            threadPool.addJob(fileJob);
            threadPool.addJob(loggingJob);

        }

        threadPool.shutdownPool();

    }

}

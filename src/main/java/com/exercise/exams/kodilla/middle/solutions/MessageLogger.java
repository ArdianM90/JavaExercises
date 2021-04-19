package com.exercise.exams.kodilla.middle.solutions;

public class MessageLogger {
    private static MessageLogger logger = null;
    private String lastLog = "";

    private MessageLogger() {
    }

    public static MessageLogger getInstance() {
        if (logger == null) {
            logger = new MessageLogger();
        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
    }

    public String getLastLog() {
        return lastLog;
    }
}

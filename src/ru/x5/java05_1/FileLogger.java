package ru.x5.java05_1;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into file: {" + message + "}");
    }
}

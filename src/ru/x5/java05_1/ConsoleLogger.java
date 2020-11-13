package ru.x5.java05_1;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Log into console: {" + message + "}");
    }
}

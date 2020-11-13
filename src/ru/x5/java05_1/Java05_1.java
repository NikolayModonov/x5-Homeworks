/*
 С помощью фабричного метода реализуйте логирование. Есть
 три логера: ConsoleLogger, FileLogger, DbLogger. Логер должен
 реализовать метод log(String message) . Все логеры пишут в
 консоль следующее:

 ConsoleLogger — Log into console: {message}
 FileLogger — Log into file: {message}
 DbLogger — Log into database: {message}

 Реализуйте класс калькулятор с методами, умножения, деления,
 вычитания и сложения. Добавьте в каждый метод логирование
 полученного результата.

 Фабрика:
 https://vertex-academy.com/tutorials/ru/pattern-factory-java/

 */

package ru.x5.java05_1;

public class Java05_1 {
    public static void main (String[]args){
        System.out.println ("Logger Fabric Soft");
        //Scanner scanner = new Scanner(System.in)
        LoggerFactory factory = new LoggerFactory();
        Logger jLogger = factory.getLogger(LoggerType.CONSOLELOGGER);
        jLogger.log("console message");
        jLogger = factory.getLogger(LoggerType.FILELOGGER);
        jLogger.log("file message");
        jLogger = factory.getLogger(LoggerType.DBLOGGER);
        jLogger.log("DB message");

    }
}


/******************************************************************************

 С помощью фабричного метода реализуйте логирование. Есть
 три логера: ConsoleLogger, FileLogger, DbLogger. Логер должен
 реализовать метод log(String message) . Все логеры пишут в к
 консоль следующее:

 ConsoleLogger — Log into console: {message}
 FileLogger — Log into file: {message}
 DbLogger — Log into database: {message}

 Реализуйте класс калькулятор с методами, умножения, деления,
 вычитания и сложения. Добавьте в каждый метод логирование
 полученного результата.

 Фабрика:
 https://vertex-academy.com/tutorials/ru/pattern-factory-java/

 Спроектировать класс компьютер с характеристиками: класс
 процессор, оперативная память, видеокарта, накопитель, монитор.
 Характеристики процессора: тактовая чистота, кол-во ядер, кеш
 память, название, производитель. Характеристики оперативной
 памяти: производитель, объем памяти, частота, тип памяти.
 Характеристики видеокарты: производитель, тип памяти, объем
 памяти, охлаждение(активное или пассивное). Характеристики
 накопителя: производитель, объем памяти, тип накопителя(HDD или
 SSD), форм-фактор.
 * Для усложнения можно создать несколько классов наследников
 для процессора, оперативной памяти, видеокарты, накопителя.
 Создания экземпляров классов характеристик использовать
 фабричный метод и стратегию.
 *******************************************************************************/

package ru.x5.java05;
import java.util.Scanner;

public class Java05 {
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


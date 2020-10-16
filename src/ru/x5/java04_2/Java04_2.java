package ru.x5.java04_2;

public class Java04_2 {

    public static void main(String[] args) {


        //Задание 2
        //1. Создать абстрактный класс класс Car, и класс Engine
        //2. Класс Engine содержит поля - мощность, производитель.
        //3. Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, мотор типа Engine. Абстрактные методы start(), stop(), и реализованные методы turnRight(), turnLeft()
        //4. Методы turnRight() и  turnLeft() выводят на экран: "Поворот направо" или "Поворот налево".
        //5. Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе.
        //6. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузов, реализовать методы start(), stop().
        // Метод start – выводит на экран «Грузовик поехал», метод stop -   «грузовик остановился».
        //7.  Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
        // Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».
        //

        Lorry lorry = new Lorry();
        lorry.setCarBrand("LorryInc");
        lorry.setCarClass('E');
        lorry.setCarWeight(6.3);
        lorry.setEngineManufacturer("Daewoo");
        lorry.setEnginePower(600);
        lorry.setTonnage(3.5);
        lorry.printInfo();
        lorry.start();
        lorry.stop();
        System.out.println();

        SportCar sportCar = new SportCar();
        sportCar.setCarBrand("Audi");
        sportCar.setCarClass('S');
        sportCar.setCarWeight(1.3);
        sportCar.setEngineManufacturer("AudiEngine");
        sportCar.setEnginePower(300);
        sportCar.setTopSpeed(245);
        sportCar.printInfo();
        sportCar.start();
        sportCar.stop();



    }
}

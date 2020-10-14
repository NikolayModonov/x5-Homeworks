package ru.x5.java04_2;

public class Lorry extends Car{

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    private double tonnage;

    @Override
    public String start() {
        return "Грузовик поехал";
    }

    @Override
    public String stop() {
        return "Грузовик остановился";
    }

    @Override
    public void printInfo() {
        System.out.println("Производитель: " + this.getCarBrand());
        System.out.println("Класс автомобиля: " + this.getCarClass());
        System.out.println("Вес автомобиля: " + this.getCarWeight());
        System.out.println("Мощность мотора: " + this.getEnginePower());
        System.out.println("Производитель мотора: " + this.getEngineManufacturer());
        System.out.println("Грузоподъемность: " + this.getTonnage());
    }

//    private String carBrand;
//    private char carClass;
//    private double carWeight;
//    private Engine engine;
}

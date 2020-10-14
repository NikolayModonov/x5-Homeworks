package ru.x5.java04_2;

public class SportCar extends Car{

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    private double topSpeed;

    public String start() {
        return "SportCar поехал";
    }

    public String stop() {
        return "SportCar остановился";
    }

    public void printInfo() {
        System.out.println("Производитель: " + this.getCarBrand());
        System.out.println("Класс автомобиля: " + this.getCarClass());
        System.out.println("Вес автомобиля: " + this.getCarWeight());
        System.out.println("Мощность мотора: " + this.getEnginePower());
        System.out.println("Производитель мотора: " + this.getEngineManufacturer());
        System.out.println("Максимальная скорость: " + this.getTopSpeed());
    }
}

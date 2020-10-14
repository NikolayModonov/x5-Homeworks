package ru.x5.java04_2;

public abstract class Car {

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public char getCarClass() {
        return carClass;
    }

    public void setCarClass(char carClass) {
        this.carClass = carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public String getEngineManufacturer() {
        return engine.getManufacturer();
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engine.setManufacturer(engineManufacturer);
    }

    public int getEnginePower() {
        return engine.getPower();
    }

    public void setEnginePower(int enginePower) {
        this.engine.setPower(enginePower);
    }

    private String carBrand;
    private char carClass;
    private double carWeight;
    private Engine engine;

    public abstract String start();

    public abstract String stop();

    public abstract void printInfo();

    public String turnRight() {

        System.out.println("Поворот направо");
    }

    public String turnLeft() {

        System.out.println("Поворот налево");
    }
}

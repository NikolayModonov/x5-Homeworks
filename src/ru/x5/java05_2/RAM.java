/*
Характеристики оперативной памяти: производитель, объем памяти, частота, тип памяти.
*/

package ru.x5.java05_2;

public class RAM extends Device {
    Brands brand;
    private int capacity;
    private int frequency;
    private RamType ramType;

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }

    @Override
    public void show(){
        System.out.println("RAM: " + getBrand() + " / " + getRamType() + " / " + getCapacity() + " Gb / " + getFrequency() + " MHz ");
    }
}

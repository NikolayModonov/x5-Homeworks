/*
 Спроектировать класс компьютер с характеристиками: класс
 процессор, оперативная память, видеокарта, накопитель, монитор.
 */
package ru.x5.java05_2;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private VideoAdapter videoadapter;
    private Drive drive;
    private Monitor monitor;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public VideoAdapter getVideoadapter() {
        return videoadapter;
    }

    public void setVideoadapter(VideoAdapter videoadapter) {
        this.videoadapter = videoadapter;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

/*
 Характеристики видеокарты: производитель, тип памяти, объем
 памяти, охлаждение(активное или пассивное).
 */

package ru.x5.java05_2;

public class VideoAdapter extends Device {
    Brands brand;
    RamType ramType;
    int ramCapacity;
    boolean activeCooler;
}

package ru.x5.java05_2;

public class ComputerFabric {
    private Computer computer;

    public static RAM MakeRAM(DeviceLevel deviceLevel){
        RAM ram = new RAM();
        // DDR4-2133 2400 2666 2800 2933 3000 3200 3466 3600
        switch (deviceLevel) {
            case WHATEVER:
                ram.setBrand(Brands.AMD);
                ram.setCapacity(2);
                ram.setFrequency(2133);
                ram.setRamType(RamType.DDR4);
                break;
            case OFFICE:
                ram.setBrand(Brands.AMD);
                ram.setCapacity(4);
                ram.setFrequency(2133);
                ram.setRamType(RamType.DDR4);
                break;
            case STUDY:
                ram.setBrand(Brands.SAMSUNG);
                ram.setCapacity(6);
                ram.setFrequency(2666);
                ram.setRamType(RamType.DDR4);
                break;
            case GAME:
                ram.setBrand(Brands.KINGSTON);
                ram.setCapacity(16);
                ram.setFrequency(3600);
                ram.setRamType(RamType.DDR4);
                break;
            default:
                ram.setBrand(null);
                ram.setCapacity(0);
                ram.setFrequency(0);
                ram.setRamType(null);
        }
        return ram;
    }

    public static CPU MakeCPU(DeviceLevel deviceLevel){
        CPU cpu = new CPU();
        switch (deviceLevel) {
            case WHATEVER:
                cpu.;
                break;
        }
        return cpu;
    }


}

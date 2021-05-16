package com.prakriti.app28;

public class LaptopComputer extends Computer {

    private String touchPad;
    private double cpuPower, ram;

    public LaptopComputer(String name, String screen, String keyboard, String touchPad, double cpuPower, double ram) {
        super(name, screen, keyboard);

        if(cpuPower <= 0)
            throw new IllegalArgumentException("CPU Power must be greater than 0");
        if(ram <= 0)
            throw new IllegalArgumentException("RAM must be greater than 0");

        this.touchPad = touchPad;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        if(cpuPower <= 0)
            throw new IllegalArgumentException("CPU Power must be greater than 0");
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        if(ram <= 0)
            throw new IllegalArgumentException("RAM must be greater than 0");
        this.ram = ram;
    }

    @Override
    public double evaluatePerformance() {
        return getCpuPower() * getRam();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTouch Pad: " + getTouchPad() + "\nCPU Power: " + getCpuPower() + "\nRAM: " + getRam();
    }
}
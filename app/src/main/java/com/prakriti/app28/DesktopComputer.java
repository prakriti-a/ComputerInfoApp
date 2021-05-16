package com.prakriti.app28;

public class DesktopComputer extends Computer {

    private String mouse;
    private double cpuPower, ram;

    public DesktopComputer(String name, String screen, String keyboard, String mouse, double cpuPower, double ram) {
        super(name, screen, keyboard);

        if(cpuPower <= 0)
            throw new IllegalArgumentException("CPU Power must be greater than 0");
        if(ram <= 0)
            throw new IllegalArgumentException("RAM must be greater than 0");

        this.mouse = mouse;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
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
        return super.toString() + "\nMouse: " + getMouse() + "\nCPU Power: " + getCpuPower() + "\nRAM: " + getRam();
    }
}
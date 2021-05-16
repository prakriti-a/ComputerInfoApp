package com.prakriti.app28;

public class SmartphoneComputer extends Computer {

    private String operatingSystem;
    private double cpuPower, ram;

    public SmartphoneComputer(String name, String screen, String keyboard, String operatingSystem, double cpuPower, double ram) {
        super(name, screen, keyboard);

        if(cpuPower <= 0)
            throw new IllegalArgumentException("CPU Power must be greater than 0");
        if(ram <= 0)
            throw new IllegalArgumentException("RAM must be greater than 0");

        this.operatingSystem = operatingSystem;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
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
        return super.toString() + "\nOperating System: " + getOperatingSystem() + "\nCPU Power: " + getCpuPower() + "\nRAM: " + getRam();
    }
}
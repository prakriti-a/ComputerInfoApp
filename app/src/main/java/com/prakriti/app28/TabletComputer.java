package com.prakriti.app28;

public class TabletComputer extends SmartphoneComputer {

    private int screenSize;

    public TabletComputer(String name, String screen, String keyboard, String operatingSystem, double cpuPower, double ram, int screenSize) {
        super(name, screen, keyboard, operatingSystem, cpuPower, ram);

        if(screenSize <= 0)
            throw new IllegalArgumentException("Screen Size must be greater than 0");
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        if(screenSize <= 0)
            throw new IllegalArgumentException("Screen Size must be greater than 0");
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreenSize: " + getScreenSize();
    }
}
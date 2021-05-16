package com.prakriti.app28;

public abstract class Computer {
    // cannot create object of abstract class

        // constant values do not have setters/mutators
    private final String name;
    private final String screen;
    private final String keyboard;

    public Computer(String name, String screen, String keyboard) {
        this.name = name;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getName() {
        return name;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nScreen: " + getScreen() + "\nKeyboard: " + getKeyboard();
    }

    public abstract double evaluatePerformance();


}

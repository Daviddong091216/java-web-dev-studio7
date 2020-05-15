package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements ISpin, IDataStore {
    private String name;
    private int capacity;
    private ArrayList<Object> contents;
    private String discType;
    private int minRPM;
    private int maxRPM;

    public BaseDisc(int minRPM, int maxRPM) {
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void Spin() {
        System.out.println("A " + this.toString() +
                " spins at between " + this.minRPM +
                "-" + this.maxRPM);
    }


}

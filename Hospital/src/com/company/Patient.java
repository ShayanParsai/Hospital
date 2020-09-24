package com.company;

public class Patient {
    private String name;
    private String sickness;
    boolean isSick = false;

    public Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    public Patient (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSickness(){
        return sickness;
    }

    public void takeMedication(Medicine medicine){

        if (medicine.getTreatmentName().equals(this.sickness)){
            this.sickness = null;
        }
    }

    public boolean isSick() {
        isSick = sickness != null;
        return isSick;
    }
}

package com.company;

public class Patient {
    private String name;
    private String sickness;
    private boolean isSick = false;

    protected Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    protected Patient (String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected String getSickness(){
        return sickness;
    }

    protected void takeMedication(Medicine medicine){

        if (medicine.getTreatmentName().equals(this.sickness)){
            this.sickness = null;
        }
    }

    protected boolean isSick() {
        isSick = sickness != null;
        return isSick;
    }
}

package com.company;

class Medicine {
    private String treatsSickness;

    public Medicine(String sickness) {
        this.treatsSickness = sickness;
    }

    public String getTreatmentName() {
        return treatsSickness;
    }
}
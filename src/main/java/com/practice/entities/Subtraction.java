package com.practice.entities;

public class Subtraction implements Operation {

    private int subtractionID;
    private Addition addition;

    public Subtraction() {
    }

    public Subtraction(String action) {
        performAction(action);
    }

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    @Override
    public String performAction(String action) {
        return action;

    }

    public int getSubtractionID() {
        return subtractionID;
    }

    public void setSubtractionID(int subtractionID) {
        this.subtractionID = subtractionID;
    }
}


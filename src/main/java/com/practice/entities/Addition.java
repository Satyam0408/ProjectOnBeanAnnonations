package com.practice.entities;

public class Addition implements Operation {

    private int additionId;

    public Addition(String action) {
        performAction(action);
    }

    @Override
    public String performAction(String action) {
        return action;

    }

    public int getAdditionId() {
        return additionId;
    }

    public void setAdditionId(int additionId) {
        this.additionId = additionId;
    }
}

package ru.hh.easybot.model;

public class Monitor extends Device{
    private float diag;

    public Monitor(float diag) {
        super();
        this.diag = diag;
    }

    @Override
    public String toAdditional() {
        return String.valueOf(diag);
    }

    @Override
    public void fromAdditional(String s) {
        this.diag = Float.valueOf(s).floatValue();
    }
}

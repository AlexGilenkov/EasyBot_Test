package ru.hh.easybot.model;

public class Monitor extends Device{
    private float diag;

    public Monitor(float diag) {
        super();
        this.diag = diag;
    }

    @Override
    public String additional() {
        return String.valueOf(diag);
    }
}

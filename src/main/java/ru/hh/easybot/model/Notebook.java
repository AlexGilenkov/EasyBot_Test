package ru.hh.easybot.model;


public class Notebook extends Device {
    private Size size;

    public Notebook(Size size) {
        super();
        this.size = size;
    }

    @Override
    public String additional() {
        return size.toString();
    }

    public enum Size {D13, D14, D15, D17}
}

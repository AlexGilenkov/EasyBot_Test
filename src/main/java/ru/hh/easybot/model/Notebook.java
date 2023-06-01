package ru.hh.easybot.model;


public class Notebook extends Device {
    private Size size;

    public Notebook(Size size) {
        super();
        this.size = size;
    }

    @Override
    public String toAdditional() {
        return size.toString();
    }

    @Override
    public void fromAdditional(String s) {
        this.size = Size.valueOf(s);
    }

    public enum Size {D13, D14, D15, D17}
}

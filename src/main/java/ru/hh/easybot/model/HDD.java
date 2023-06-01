package ru.hh.easybot.model;

public class HDD extends Device{
    private float volume;

    public HDD(float volume) {
        super();
        this.volume = volume;
    }

    @Override
    public String toAdditional() {
        return String.valueOf(volume);
    }

    @Override
    public void fromAdditional(String s) {
        this.volume = Float.valueOf(s).floatValue();
    }
}

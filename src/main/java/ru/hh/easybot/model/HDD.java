package ru.hh.easybot.model;

public class HDD extends Device{
    private float volume;

    public HDD(float volume) {
        super();
        this.volume = volume;
    }

    @Override
    public String additional() {
        return String.valueOf(volume);
    }
}

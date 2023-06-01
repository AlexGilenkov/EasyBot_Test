package ru.hh.easybot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public class HDD extends Device{
    @Column(name = "_additional", nullable = false)
    private Float volume;

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
        this.volume = Float.valueOf(s);
    }
}

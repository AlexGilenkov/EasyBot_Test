package ru.hh.easybot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public class Monitor extends Device{
    @Column(name = "_additional", nullable = false)
    private Float diag;

    public Monitor(Float diag) {
        super();
        this.diag = diag;
    }

    @Override
    public String toAdditional() {
        return String.valueOf(diag);
    }

    @Override
    public void fromAdditional(String s) {
        this.diag = Float.valueOf(s);
    }
}

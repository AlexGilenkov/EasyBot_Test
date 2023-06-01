package ru.hh.easybot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public class Notebook extends Device {
    @Column(name = "_additional", nullable = false)
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

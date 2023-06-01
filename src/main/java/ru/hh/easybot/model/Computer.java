package ru.hh.easybot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "test")
@Data
public class Computer extends Device {
    @Column(name = "_additional", nullable = false)
    private FormFactor formFactor;

    public Computer(FormFactor formFactor) {
        super();
        this.formFactor = formFactor;
    }
    @Override
    public String toAdditional() {
        return formFactor.toString();
    }

    public void fromAdditional(String str) {
        this.formFactor = FormFactor.valueOf(str);
    }

    public enum FormFactor {DESKTOP, NETTOP, MONOBLOCK}
}



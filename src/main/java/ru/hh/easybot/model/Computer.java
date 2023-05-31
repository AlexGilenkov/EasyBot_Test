package ru.hh.easybot.model;


import org.springframework.context.annotation.Bean;


public class Computer extends Device {
    private FormFactor formFactor;

    public Computer(FormFactor formFactor) {
        super();
        this.formFactor = formFactor;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String additional() {
        return formFactor.toString();
    }

    public enum FormFactor {DESKTOP, NETTOP, MONOBLOCK}
}



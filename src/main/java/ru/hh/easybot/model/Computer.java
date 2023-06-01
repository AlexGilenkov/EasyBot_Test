package ru.hh.easybot.model;


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
    public String toAdditional() {
        return formFactor.toString();
    }

    public void fromAdditional(String str){
        this.formFactor = FormFactor.valueOf(str);
    }

    public enum FormFactor {DESKTOP, NETTOP, MONOBLOCK}
}



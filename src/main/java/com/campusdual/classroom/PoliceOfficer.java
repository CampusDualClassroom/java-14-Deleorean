package com.campusdual.classroom;

public class PoliceOfficer extends Person {

    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }

    @Override
    public void getDetails() {
        System.out.println("Este/a pañoco/a se llama " + name + " " + surname + " y está en la brigada: " + squad);
    }
}

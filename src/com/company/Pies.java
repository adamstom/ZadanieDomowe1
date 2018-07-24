package com.company;

public class Pies extends Zwierze {

    private RasyPsow rasaPsa;

    public RasyPsow getRasaPsa() {
        return rasaPsa;
    }

    public void setRasaPsa(RasyPsow rasaPsa) {
        this.rasaPsa = rasaPsa;
    }

    Pies(String imie, int wiek) {
        super(imie, wiek);
    }

    @Override
    public void kimJestem() {
        System.out.println("Jestem Pies");
    }
}

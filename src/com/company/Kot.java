package com.company;

public class Kot extends Zwierze {

    private RasyKotow rasaKota;

    public RasyKotow getRasaKota() {
        return rasaKota;
    }

    public void setRasaKota(RasyKotow rasaKota) {
        this.rasaKota = rasaKota;
    }

    Kot(String imie, int wiek) {
        super(imie, wiek);

    }

    @Override
    public void kimJestem() {
        System.out.println("Jestem Kot");
    }
}
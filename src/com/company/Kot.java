package com.company;

public class Kot extends Zwierze {

    private RasyKotow rasaKota;

    //TODO konstruktor powinien się znajdować po dekaracji pól w klasie
    Kot(String imie, int wiek) {
        super(imie, wiek);
    }
    public RasyKotow getRasaKota() {
        return rasaKota;
    }

    public void setRasaKota(RasyKotow rasaKota) {
        this.rasaKota = rasaKota;
    }


    @Override
    public void kimJestem() {
        System.out.println("Jestem Kot");
    }
}

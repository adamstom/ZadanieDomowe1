package com.company;

public class Zwierze {
    private String imie;
    private int wiek;

    //TODO konstruktor powinien być publiczny - tak było w zadaniu
    Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public void kimJestem() {
        System.out.println("Jestem Zwierzę");
    }
}

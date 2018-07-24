package com.company;

public class Czlowiek {

    private String imie;
    private String nazwisko;
    private Zwierze zwierze;
    private DaneAdresowe daneAdresowe;

    public String getImie() {
        return imie;
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }

    public DaneAdresowe getDaneAdresowe() {
        return daneAdresowe;
    }

    public void setDaneAdresowe(DaneAdresowe daneAdresowe) {
        this.daneAdresowe = daneAdresowe;
    }

    public String getNazwisko() {
        return nazwisko;

    }

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.println("Czesc nazywam sie " + imie + " " + nazwisko + ".");
    }

    public void przedstawSie(String komunikat) {
        System.out.println("Czesc nazywam sie " + imie + " " + nazwisko + ". " + komunikat);
    }
}

package com.company;

public class Ksiazka {
    private String tytul;
    private String autor;

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", liczbaStron=" + liczbaStron +
                '}';
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    private String wydawnictwo;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, String wydawnictwo, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.liczbaStron = liczbaStron;
    }
}

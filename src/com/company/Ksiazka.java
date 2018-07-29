package com.company;

public class Ksiazka {
    private String tytul;
    private String autor;
    //TODO doeklaracje pól w klasie robimy na samym początku
    private String wydawnictwo;
    private int liczbaStron;

    //TODO konstruktor powinien się znajdować po dekaracji pól w klasie
    public Ksiazka(String tytul, String autor, String wydawnictwo, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.liczbaStron = liczbaStron;
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

    //TODO metoda toString powinna znajdować się na samym dole klasy
    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", wydawnictwo='" + wydawnictwo + '\'' +
                ", liczbaStron=" + liczbaStron +
                '}';
    }
}

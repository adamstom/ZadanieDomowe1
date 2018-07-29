package com.company;


import java.util.HashSet;
import java.util.Set;

public class ZbiorImion {

    private Set<String> set = new HashSet<>();
    private String imie = "";

    public Set<String> getSet() {
        return set;
    }

    public String getImie() {
        return imie;
    }

    public void zapiszImie(String imie) {
        if (set.add(imie)) {
            System.out.println("Dodano imie: " + imie + " do listy");
        } else {
            System.out.println("Imie jest juz w bazie danych");
        }
    }
}

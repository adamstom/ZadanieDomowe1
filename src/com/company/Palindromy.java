package com.company;

import java.util.HashSet;
import java.util.Set;

public class Palindromy {

    private Set<String> set = new HashSet<>();
    private String wyraz = "";

    public Set<String> getSet() {
        return set;
    }

    public String getWyraz() {
        return wyraz;
    }

    public void zapiszWyraz(String wyraz) {

        if (czyPalindrom(wyraz) && set.add(wyraz)) {
            System.out.println("Dodano wyraz: " + wyraz + " do listy");
        } else {
            System.out.println("Wyraz jest juz w bazie danych lub nie jest palindromem");
        }
    }

    private String odwrocWyraz(String string) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    private boolean czyPalindrom (String s){
       return  s.equals(odwrocWyraz(s));
    }
}

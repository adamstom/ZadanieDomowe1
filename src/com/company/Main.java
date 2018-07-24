package com.company;

public class Main {

    public static void main(String[] args) {

        //Zadanie 1
        Pies piesek = new Pies("Burek", 2);
        Kot kotek = new Kot("Filemon", 1);

        System.out.println(piesek.toString());
        System.out.println(kotek.toString());
        //System.out.println("blablabla"); to byl test :)

        //Zadanie 2
        kotek.kimJestem();
        piesek.kimJestem();

        //Zadanie 3
        //Zadanie 4
        Czlowiek zosia = new Czlowiek("Zosia", "Samosia");
        Czlowiek jan = new Czlowiek("Jan", "Kowalski");

        zosia.setZwierze(kotek);
        jan.setZwierze(piesek);

        //Zadanie 5
        jan.przedstawSie();
        jan.przedstawSie("Lubie placki");

        //Zadanie 6

    }
}

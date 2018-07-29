package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> lista = new ArrayList<>();
        lista.add("Ala");
        lista.add("ma");
        lista.add("kota");
        lista.add("i");
        lista.add("kot");
        lista.add("ma");
        lista.add("Ale");
        lista.add("kotek");
        lista.add("pije");
        lista.add("mleko");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("==========");

        for (String element : lista) {
            System.out.println(element);
        }

        //Zadanie 7
        List<Integer> listaInt = new ArrayList<>();

        listaInt.addAll(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

        for (int i : listaInt) {
            System.out.println(i);
        }

        System.out.println("\n" + listaInt.size() + "\n");
        listaInt.remove(0);
        listaInt.remove(listaInt.size() - 1);

        for (int i : listaInt) {
            System.out.println(i);
        }

        //Zadanie 8
        List<Ksiazka> listaKsiazek = new ArrayList<>();
        listaKsiazek.addAll(Arrays.asList(
                new Ksiazka("Ksiazka1", "Autor1", "Wydawnictwo1", 200),
                new Ksiazka("Ksiazka2", "Autor2", "Wydawnictwo2", 150),
                new Ksiazka("Ksiazka3", "Autor3", "Wydawnictwo3", 100),
                new Ksiazka("Ksiazka4", "Autor4", "Wydawnictwo4", 300),
                new Ksiazka("Ksiazka5", "Autor5", "Wydawnictwo5", 500),
                new Ksiazka("Ksiazka6", "Autor6", "Wydawnictwo6", 60),
                new Ksiazka("Ksiazka7", "Autor7", "Wydawnictwo7", 99),
                new Ksiazka("Ksiazka8", "Autor8", "Wydawnictwo8", 222),
                new Ksiazka("Ksiazka9", "Autor9", "Wydawnictwo9", 333),
                new Ksiazka("Ksiazka10", "Autor10", "Wydawnictwo10", 80),
                new Ksiazka("Ksiazka11", "Autor11", "Wydawnictwo11", 1000)
        ));

        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka);
        }

        listaKsiazek.remove((listaInt.size() - 1) / 2);

        System.out.println("================");

        for (Ksiazka ksiazka : listaKsiazek) {
            System.out.println(ksiazka);
        }

        System.out.println("================");

        for (Ksiazka ksiazka : listaKsiazek) {
            if (ksiazka.getLiczbaStron() > 200) {
                System.out.println(ksiazka);
            }
        }

        //Zadanie 9

        List<Ksiazka> nowaListaKsiazek=new ArrayList<>();
        nowaListaKsiazek.add(new Ksiazka("book1","Mickiewicz1","PWN1",100));
        nowaListaKsiazek.add(new Ksiazka("book2","Mickiewicz2","PWN2",101));
        nowaListaKsiazek.add(new Ksiazka("book3","Mickiewicz3","PWN3",102));
        nowaListaKsiazek.add(new Ksiazka("book4","Mickiewicz4","PWN4",103));

        listaKsiazek.addAll(nowaListaKsiazek);

        System.out.println("================");
        System.out.println(listaKsiazek.size());
        System.out.println("================");

        for(Ksiazka ksiazka:listaKsiazek){
            System.out.println(ksiazka);
        }

        //Zadanie 10

        App app=new App();
        app.runApp();

    }
}


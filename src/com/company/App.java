package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    ZbiorImion zbior = new ZbiorImion();
    String imie = "";

    public void runApp() {

        System.out.println("Podawaj po kolei imiona, ktore chcesz dodac do listy, napisz END aby zakonczyc dodawanie");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (!imie.equals("END")) {

                System.out.println("Podaj imie");
                imie = reader.readLine();

                if (!imie.equals("END"))
                    zbior.zapiszImie(imie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        stopApp();
    }


    private void stopApp() {
        System.out.println("Ilosc imion w zbiorze: " + zbior.getSet().size());
        System.out.println("Imiona w zbiorze:");
        for (String s : zbior.getSet()) {
            System.out.println(s);
        }
    }
}


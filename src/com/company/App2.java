package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {
    private Palindromy zbior = new Palindromy();
    private String wyraz = "";

    public void runApp() {

        System.out.println("Podawaj po kolei palindromy, ktore chcesz dodac do listy, napisz END aby zakonczyc dodawanie");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            while (!wyraz.equals("END")) {

                System.out.println("Podaj wyraz");
                wyraz = reader.readLine();

                if (!wyraz.equals("END"))
                    zbior.zapiszWyraz(wyraz);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        stopApp();
    }


    private void stopApp() {
        System.out.println("Ilosc wyrazow w zbiorze: " + zbior.getSet().size());
        System.out.println("Wyrazy w zbiorze:");
        for (String s : zbior.getSet()) {
            System.out.println(s);
        }
    }
}

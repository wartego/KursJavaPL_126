package dzien3;

import java.util.Scanner;

public class SprawdzenieWielkosciLiter {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie: ");
        Scanner input = new Scanner(System.in);

        // Wersja 1

        String imie = input.nextLine();
        char c = imie.charAt(0);
        int liczba = c;

        System.out.println(c); // Litera
        System.out.println(liczba); // moze tez byc wyswietlenie bez deklaracji liczba w postaci (int)c

        if (liczba >= 65 && liczba <= 90) System.out.println("Wyraz zostal wypisany wielka litera");
        else if (liczba >= 97 && liczba <= 122) System.out.println("Wyraz napisany jest mala litera");
        else if (liczba >= 48 && liczba <= 57) System.out.println("To jest cyfra");
        else System.out.println("cos innego");

        
        
       /*
            // Wersja 2

           char text = input.nextLine().charAt(0);
          int value = text;


        System.out.println(text); // Litera
        System.out.println(value); // int value - pokazuje jako liczbe
     
        if (value >= 65 && value <= 90) System.out.println("Wyraz zostal wypisany wielka litera");
        else if (value >= 97 && value <= 122) System.out.println("Wyraz napisany jest mala litera");
        else if (value >= 48 && value <= 57) System.out.println("To jest cyfra");
        else System.out.println("cos innego");
        */
    }
}

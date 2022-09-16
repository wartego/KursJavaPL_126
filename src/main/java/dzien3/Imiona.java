package dzien3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Imiona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = input.nextLine();
        String temp;
        if (Pattern.matches("[A-Z][a-z]*", imie))
            temp = "Twoje imie to: " + imie;
        else temp = "Imie podaje się z wielkiej litery";
        System.out.println(temp + " \n Podaj swoje nazwisko:");

        String nazwisko = input.nextLine();
        if (Pattern.matches("[A-Z][a-zńęóśźżł]+", nazwisko))
            temp = "Twoje nazwisko to: " + nazwisko;
        else temp = "Nazwisko podaje sie z wielkiej litery";
        System.out.println(temp + "\n Podaj swoj wiek: ");

        String wiek = input.nextLine();
        if (Pattern.matches("[0-9]*", wiek))
            temp = "Twoje wiek to: " + wiek;
        else temp = "Nieprawidłowy wprowadzony wiek";
        System.out.println(temp);
    }
}

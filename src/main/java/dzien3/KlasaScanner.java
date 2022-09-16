package dzien3;


import java.util.Scanner;

public class KlasaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jak masz na imie: ");
        //String imie = input.nextLine();
        char imie = input.nextLine().charAt(0);
        System.out.println(imie);

//
//        System.out.println("Jak masz na nazwisko: ");
//        String nazwisko = input.nextLine();
//
//        System.out.println("Jaki masz adres: ");
//        String adres = input.nextLine();
//
//        System.out.println("Jaki masz wiek: ");
//        int wiek = input.nextInt();
//        input.nextLine().charAt(0);
//
//        System.out.println("Prawda czy falsz: ");
//        boolean pytanie = input.nextBoolean();


//
//        System.out.println("Imie: " + imie);
//        System.out.println("Naziwsko: " + nazwisko);
//        System.out.println("wiek: " + wiek);
//        System.out.println("Adres: " + adres);
//        System.out.println("Pytanie: " + pytanie);

        input.close();
    }
}

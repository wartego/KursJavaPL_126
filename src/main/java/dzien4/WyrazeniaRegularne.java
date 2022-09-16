package dzien4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String imie = input.nextLine();


        System.out.println("Podaj swoje nazwisko: ");
        String nazwisko = input.nextLine();

        System.out.println("Podaj swoj wiek: ");
        String wiek = input.nextLine();

       // char c = imie.charAt(0);

        if (Pattern.matches("[1-3]*", imie)) {
            System.out.println("Wprowadzone imie jest z małej litery");
       } else {
            System.out.println("Imie z duzej litery");
        }


















        // 1 sposob
//        Pattern p = Pattern.compile(".s"); // kropka reprezentuje pojedynczy znak
//        Matcher m = p.matcher("as");
//        boolean b = m.matches();

        //
    }
}

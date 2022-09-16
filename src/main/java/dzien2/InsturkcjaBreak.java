package dzien2;

public class InsturkcjaBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World " + i);
            if (i == 1) {
                System.out.println("Wynik porowniania: " + (i == 1));
                break;
            }
        }
        System.out.println("$$$$$$");


        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println("Wynik porowniania: " + i);
// if (i%2 !=0) nieparzyste tylko wypisuje
        }
    }
}
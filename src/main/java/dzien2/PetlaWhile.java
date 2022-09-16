package dzien2;

public class PetlaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("Hello World " + i);
            ++i;
        }

        int ii = 0;
        do {
            System.out.println("Hello World: " + ii);
            ++ii;
        } while (ii < 10);
    }
}
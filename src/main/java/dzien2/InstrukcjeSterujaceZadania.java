package dzien2;

public class InstrukcjeSterujaceZadania {
    public static void main(String[] args) {
        // liczba parzysta wynik dzielenia przez 2 nie zwraca reszty
        //
        int  liczba = 4;
        czyParzysta(56);
        //czyParzysta(4);
        String s = czyParzystaString(liczba);
        System.out.println(s);
    }
   static void czyParzysta(int liczba){
        if(liczba % 2 == 0){
            System.out.println("Liczba jest parzysta");

        }else {
            System.out.println("Liczba nie jest parzysta " +liczba %2 );
        }
    }
    static String czyParzystaString(int liczba){
        String wynik;
        if (liczba % 2 == 0) {
            wynik = "liczba jest parzysta";
            return wynik;
        }else {
            wynik = "liczba nie jest parzysta";
            return wynik;
        }
    }
}

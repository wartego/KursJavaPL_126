package dzien2;

public class KonwersjaTypow {
    public static void main(String[] args) {
        int caleCiastka = 5;
        float polamaneciastka = caleCiastka;

        System.out.println(polamaneciastka);

        double n = 99.88483;
        int m = (int)n;
        System.out.println(m);
        n=m;
        System.out.println("N"+n);

        n = 99.853;
        m= (int) Math.round(n);
        System.out.println(m);

        n = 999.9942;
        int x = (int)n;
        System.out.println(x);
    }
}

package dzien2;

public class OperatorRelacji {
    public static void main(String[] args) {
        int bialeCiastka = 5;
        int ciemneCiastka = 6;
        boolean wynik = (bialeCiastka == ciemneCiastka);
        System.out.println(wynik);

        System.out.println(bialeCiastka < ciemneCiastka);

        boolean valueTrue = true;
        boolean valueFalse = false;
        System.out.println("######");
        System.out.println(valueFalse || valueTrue);
        System.out.println(valueTrue || valueTrue);
        System.out.println(!valueFalse || valueTrue);
        System.out.println(valueFalse || valueFalse);
        System.out.println(!(valueFalse || valueTrue));
    }
}

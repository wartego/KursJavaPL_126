package dzien1;

public class Zadanie1 {
    public static void main(String[] args) {
//        byte zmiennaBye = 128;
//        short zmiennaShort = 32768;
//        int zmiennaInt = 2147483648;
//        long

int dodaj = 1;
        byte  zmiennaByte = Byte.MAX_VALUE;
        short  zmiennaShort = Short.MAX_VALUE;
        int  zmiennaInteger  = Integer.MAX_VALUE;
        double  zmiennaDouble = Double.MAX_VALUE;
        float  zmiennaFloat = Float.MAX_VALUE;


        System.out.println(zmiennaByte +1 );
        System.out.println(zmiennaShort + 1);
        System.out.println(zmiennaInteger + 1);
        System.out.println(zmiennaDouble + 1);
        System.out.println(zmiennaFloat + 1);
    }
}

//byte variableByte = (byte) (Byte.MAX_VALUE +1); // rzutowanie na byte w nawiasach wartosci z przekroczoną max wartoscia
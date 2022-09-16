package dzien4;

public class Tablice_przyklady {
    public static void main(String[] args) {
        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Ala","ma","kota","i","szczura"};
        myArray[1] = new String[]{"Ja","nie mam","psa"};
        System.out.println(myArray[0][3]);
        System.out.println(myArray.length);


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println(myArray[i][j]);
                }
        }

    }
}

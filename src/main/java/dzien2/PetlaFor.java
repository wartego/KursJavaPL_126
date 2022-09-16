package dzien2;

public class PetlaFor {
    public static void main(String[] args) {
//       for(int i = 0; i<10;i++){
//            System.out.println("Licznik i: " + i);


        String[] tablica = {"Ala", "ma", "kota"};

//        for (String element: tablica){
//            System.out.println(element);

        for (String s : tablica) {
          System.out.println(s);

      }
        for (int i = 0; i < tablica.length - 1; i++) {
            System.out.println(tablica[i]);
            System.out.println(tablica.length);
        }
    }
}


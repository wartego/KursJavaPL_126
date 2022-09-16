package dzien2;

import java.util.Locale;

public class Instrukcjesterujace {
    public static void main(String[] args) {
        float temperature = 35.5f;
        if(temperature>36.6){
            System.out.println("Masz goraczke");
        } else {
            System.out.println("Temperatura w normie");
        }

        String value = "Jajko ";
        switch (value.toUpperCase(Locale.ROOT).trim()){
            case "Patelnia":
                System.out.println("nic nie ma na patelni");
                break;
            case "JAJKO":
                System.out.println("Bedzie jajecznica");
                break;
            case "Tost":
                System.out.println("Bedzie tost");
                break;
            default:
                System.out.println("Informacja domysla");


        }

    }
}

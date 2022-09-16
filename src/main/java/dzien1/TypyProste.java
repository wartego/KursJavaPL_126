package dzien1;

public class TypyProste {
    public static void main(String[] args) {
//        int myVariable = 20;
//        System.out.println("Wartosc zmiennej: "+ myVariable);
        byte variableByte = 50;
        System.out.println("Byte: " + variableByte);
        System.out.println(Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);

        short variableShort = 200;
        System.out.println("Short: " + variableShort);
        System.out.println(Short.MIN_VALUE + " - " + Short.MAX_VALUE);

        int variableInt = 200;
        System.out.println("Int: " + variableInt);
        System.out.println(Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);

        long variableLong = 200;
        System.out.println("Long: " + variableLong);
        System.out.println(Long.MIN_VALUE + " - " + Long.MAX_VALUE);

    }
}

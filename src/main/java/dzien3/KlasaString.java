package dzien3;

public class KlasaString {
    public static void main(String[] args) {
        String myText = "This is a simple text";
        String myText2 = new String("This is a simple text");
        String myText3 = "This is a simple text";


        System.out.println(myText);
        System.out.println(myText2);

        System.out.println(myText == myText2);
        System.out.println(myText.equals(myText2));
        System.out.println("!!!!!!!!");

        myText2 = myText2.intern();

        System.out.println(myText == myText2);
        System.out.println(myText.equals(myText2));
        System.out.println("@@@@@@");

        System.out.println(myText == myText2);
        System.out.println(myText == myText3);
        System.out.println(myText.equals(myText2));

    }
}


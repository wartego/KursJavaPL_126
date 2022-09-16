package dzien4;

public class Klasy {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Mercedes");
        car.setColor("Silver");
        car.setMaxSpeed(250);
        car.printCarParameters();


        ///////// wersja 2
        Car auto = new Car ("Red" ,250,"Fiat");
        auto.printCarParameters();
        ///////// koniec wersja 2


//       Book ksiazka = new Book();
//       ksiazka.title = "PWN";
//       ksiazka.author = "Piasecki";
//       ksiazka.setNumberOfPages(100);
//
//        System.out.println(ksiazka);
    }
}
 class Car {
    private String color;
    private int maxSpeed;
    private String brand;

    //////////////////////////// inna wersja
    public Car(String color, int maxSpeed, String brand){
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.color = color;
    }
    public Car(){

    }
    /////////////////// koniec innej wersji
    public void setColor(String color) {
        this.color = color; // dopisanie do color (private String color) wartosci color
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printCarParameters() {
        System.out.println(String.format("Car color is: %s, max speed is: %d, car brand is: %s", color, maxSpeed, brand));
    }
}

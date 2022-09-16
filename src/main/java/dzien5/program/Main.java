package dzien5.program;

import dzien5.program.models.Book;
import dzien5.program.models.Client;
import dzien5.program.util.Utils;

public class Main {
    public static Book panTadeusz = new Book(
        "Pan Tadeusz",
        "Adam Mickiewicz",
        1000,
        true
);
    public static Book nadNiemnem = new Book(
            "Nad Niemnem",
            "Eliza Orzeszkowa",
            650,
            true
    );

   public static Client marek = new Client(
                    "Marek",
                    "Kokoczko"
   );
   public static Client karol = new Client(
                    "Karol",
                    "Majuszek"
   );

    public static void main(String[] args) {
        ;
        rentBook(nadNiemnem, marek);
        rentBook(nadNiemnem, karol);

        // oddanie ksiazki
        System.out.println("##########");
        returnBook(nadNiemnem, marek);
        returnBook(nadNiemnem, karol);

      }


    public static void rentBook(Book book, Client client) {
        System.out.println(client.getName() + " is trying to rent " + book.getTitle());
        if (!Utils.checkifAvailable(book))
            System.out.println(book.getTitle() + " is not available");
        else {
            client.setBook(book);
            book.setAvailable(false);
            System.out.println("Client : " + client.getName() + " has rented book: " + book.getTitle());
            //  } else System.out.println(book) + " is not available");
        }
    }




    public static void returnBook(Book book, Client client){
        System.out.println(client.getName() + " is getting back a book: " + book.getTitle());
        if(client.getBook() !=book)
            System.out.println(client.getName() + " has not rented book: " + book.getTitle());
        else {
            client.setBook(null);
            book.setAvailable(true);
            System.out.println("Client : " + client.getName()+ " has returned book: " + book.getTitle());
        }
    }

}

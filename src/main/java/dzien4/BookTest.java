package dzien4;

public class BookTest {
    public static void main(String[] args) {
        Book testBook = new Book();
        testBook.author = "Adam Mickiewicz";
        testBook.title = "Pan Tadeusz";
        testBook.setNumberOfPages(250);

        System.out.println("Tytuł książki: " + testBook.title);
        System.out.println("Autor książki: " + testBook.author);

        System.out.println("Liczba stron: " + testBook.getNumberOfPages());  // Błąd kompilacji!
    }
}
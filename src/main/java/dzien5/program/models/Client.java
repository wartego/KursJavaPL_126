package dzien5.program.models;

public class Client {
    private String name = "";
    private String surname = "";
    private Book book;

    public Client() {
    }

    //constructor
    public Client(String name, String surname, Book book) {
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.book = null;
    }

    // gettery and settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    // to string


    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", book=" + book + '}';
    }
}

package dzien5.program.models;

public class Book {
    private String title = "";
    private String author = "";
    private int pages;
    private boolean isAvailable= true;
    // tworzenie GENERATE -> Construcktor

    public Book(String title, String author, int pages, boolean isAvailable) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    // trzeba teraz stworzyc getery i settery
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
//setter aby moc ustawic wartosc czy wypozyczono
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // toString


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

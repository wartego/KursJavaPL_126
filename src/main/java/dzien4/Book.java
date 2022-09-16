package dzien4;

public class Book {
        public String title;        // pole publiczne
        public String author;
        private int numberOfPages ;  // pole prywatne // przypisanie wartosci nic nie da

        public int getNumberOfPages() {
                return numberOfPages + 10;
        }

//        public Book(String title, String author, int numberOfPages){
//                this.title = title;
//                this.author = author;
//                this.numberOfPages = numberOfPages;
//        }

        public void setNumberOfPages(int numberOfPages) {   // metoda publiczna
                if (isNumberOfPagesIsCorrect(numberOfPages)) {
                        this.numberOfPages = numberOfPages;
                } else {
                        System.out.println("The provided number of pages is incorrect: " + numberOfPages);
                }
        }

        private boolean isNumberOfPagesIsCorrect(int numberOfPages) {   // metoda prywatna
                return numberOfPages > 0;
        }

        @Override
        public String toString() {
                return "Book{" +
                        "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", numberOfPages=" + numberOfPages +
                        '}';
        }


}
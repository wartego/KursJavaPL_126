package dzien5.program.util;

import dzien5.program.models.Book;

public class Utils {
    //sprwadza czy ksiaza jest wypozyczona
    public static boolean checkifAvailable(Book book){
        return book.isAvailable();
    }
}

package Book;

import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        RBook book = new RBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}

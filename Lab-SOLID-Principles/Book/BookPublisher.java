package Book;

import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        PBook book = new PBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}

package Week04.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Library {
    private Book[] books;

    public Library(int capacity) {
        if (capacity < 1)
            books = new Book[5];
        books = new Book[capacity];
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    public Book borrow(String title) {
        for (Book book : books) {
            if (title.equals(book.getBookTitle())) {
                book.setBorrowed(true);
                return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        int counter = 1;
        StringBuilder str = new StringBuilder();

        str.append("Contents of the library\n");

        for (Book book : books) {
            str.append(counter).append(". ").append(book.toString()).append("\n");
            counter++;
        }

        return String.valueOf(str);
    }
}

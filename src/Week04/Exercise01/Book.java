package Week04.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Book {
    private String bookTitle;
    private String authorName;
    private boolean borrowed;

    public Book(String bookTitle, String authorName) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.borrowed = false;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        String borrowed;
        if (isBorrowed()) {
            borrowed = "Yes";
        } else {
            borrowed = "No";
        }

        return getBookTitle() + " By " + getAuthorName() + " is borrowed: " + borrowed;
    }
}

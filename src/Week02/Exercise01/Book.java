package Week02.Exercise01;

/**
 * Created by Miguel Emmara
 */
public class Book {
    String title;
    String author;
    int numberOfPages;

    public Book() {
    }

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String str = "";

        str += "The book title is: " + getTitle() + "\n";
        str += "The book author is: " + getAuthor() + "\n";
        str += "The book has" + getNumberOfPages() + " pages";

        return str;
    }
}




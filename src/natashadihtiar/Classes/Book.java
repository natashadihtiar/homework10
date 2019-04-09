package natashadihtiar.Classes;
import natashadihtiar.Enums.CoverType;
import natashadihtiar.Enums.Condition;
import java.util.ArrayList;

public class Book {
    String name;
    ArrayList<Author> author;
    Publisher publisher;
    int publisherYear;
    int pages;
    CoverType coverType;
    Condition condition;



    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public int getPages() {
        return pages;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public Condition getCondition() {
        return condition;
    }

    public void addAuthor(Author author) {
        this.author.add(author);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Book(Book book) {
        this.author = book.author;
        this.condition=book.condition;
        this.coverType=book.coverType;
        this.pages=book.pages;
        this.publisherYear=book.publisherYear;
        this.publisher=book.publisher;
        this.name=book.name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                ", publisherYear=" + publisherYear +
                ", pages=" + pages +
                ", coverType=" + coverType +
                ", condition=" + condition +
                '}';
    }

    public Book(String name, Author[] author, Publisher publisher, int publisherYear, int pages, CoverType coverType, Condition condition) {
        this.name = name;
        this.author = new ArrayList<>();
        for (Author author1 :author) {
            this.author.add(author1);
        }
        this.publisher = publisher;
        this.publisherYear = publisherYear;
        this.pages = pages;
        this.coverType = coverType;
        this.condition = condition;


    }
}

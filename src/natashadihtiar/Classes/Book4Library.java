package natashadihtiar.Classes;

import natashadihtiar.Enums.Condition;
import natashadihtiar.Enums.CoverType;

public class Book4Library extends  Book {
    int ID;

    public Book4Library(int id, String name, Author[] author, Publisher publisher, int publisherYear, int pages, CoverType coverType, Condition condition) {
        super(name, author, publisher, publisherYear, pages, coverType, condition);
   this.ID=id;

    }

    public Book4Library(Book book) {
        super(book);
    }

    @Override
    public String toString() {
        return ID +":"+ super.toString();
    }
}


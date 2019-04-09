package natashadihtiar;
import natashadihtiar.Classes.Author;
import natashadihtiar.Classes.Book;
import natashadihtiar.Classes.Library;
import natashadihtiar.Classes.Publisher;
import natashadihtiar.Enums.Condition;
import natashadihtiar.Enums.CoverType;
import natashadihtiar.Enums.Genres;
import natashadihtiar.Classes.Book4Library;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Book book1 = new Book("Alphabet", new Author[] {new Author("Petrov", Genres.детектив, new Date("1970/10/09"))}, new Publisher("BHV", "www.BHV.com.ua", 1990), 2016, 40, CoverType.мягкая, Condition.нормальное);
        System.out.println(book1);
        Book book2 = new Book("Azbuka", new Author[] {new Author("Ivanov", Genres.детектив, new Date("1980/10/03"))}, new Publisher("Veselka", "www.veselka.com.ua", 1985), 2010, 120, CoverType.суперобложка, Condition.хорошее);
        System.out.println(book2);
        Book book3 = new Book("Harry Potter", new Author[] {new Author("Rouling", Genres.фантастика, new Date("1980/10/03"))}, new Publisher("NK", "www.NK.com.ua", 2005), 2010, 120, CoverType.суперобложка, Condition.хорошее);
        System.out.println(book3);
	book1.getAuthor().get(0).addAuthorGenres(Genres.лирика);
	book1.setCondition(Condition.плохое);
        book2.getAuthor().get(0).addAuthorGenres(Genres.проза);
        book2.setCondition(Condition.отличное);

	Book4Library book4Library1 =  new Book4Library(book1);
        Book4Library book4Library2 =  new Book4Library(book2);
        Book4Library book4Library3 =  new Book4Library(book3);
        Library library = new Library();
        library.addBook(book4Library1);
        library.addBook(book4Library2);
        library.addBook(book4Library3);
        System.out.println(library);

        System.out.println(library.searchByTitle("Az"));
        ArrayList<Integer> foundBooks = library.searchByTitleList("Harry");

        for (int i: foundBooks) {
            System.out.println(library.getBookByID(i));
        }

        ArrayList<Integer> foundBooks1 = library.searchByAuthor("Rouling");

        for (int i: foundBooks1) {
            System.out.println(library.getBookByID(i));}
    }
}

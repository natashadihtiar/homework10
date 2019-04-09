package natashadihtiar.Classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book4Library> books;

    public Library() {
        this.books=new ArrayList<>();
    }

    public Library(int booksNumber) {
        this.books = new ArrayList<>(booksNumber);
    }

    public ArrayList<Book4Library> getBooks() {
        return books;
    }
    public void addBook( Book4Library book)
    {
        if (this.books.isEmpty())
        book.ID=1;
        else
            book.ID=this.books.get(this.books.size()-1).ID++;
        this.books.add(book);
    }

    @Override
    public String toString() {
        String result = "Library:  ";
        for (Book4Library book:this.books) {
            result+= book +"\n";
            return result;
        }
        return "Library{" +
                "books=" + books +
                '}';
    }

    public String searchByTitle(String title)
    {
        String result = "";
        for (Book book: this.books)
        {
            if(book.name.contains(title))
                result+=book+"\n";

        }
        return  result;
    }


    public ArrayList<Integer> searchByAuthor(String author)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (Book4Library book: this.books)
        {
            if(book.author.contains(author))
                result.add(book.ID);
        }
        return  result;
    }
    public ArrayList<Integer> searchByTitleList(String title)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (Book4Library book: this.books)
        {
            if(book.name.contains(title))
                result.add(book.ID);

        }
return  result;
    }

    public Book4Library getBookByID(int id)
    {
        Book4Library book4Library = null;
        for (Book4Library book:this.books) {
            if(book.ID==id){
                book4Library=book;
                break;
        }}
        return book4Library;
    }
}

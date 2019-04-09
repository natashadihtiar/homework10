package natashadihtiar.Classes;
import natashadihtiar.Enums.Genres;
import java.util.ArrayList;
import java.util.Date;

public class Author {
    String name;
   ArrayList<Genres> authorGenres;
    Date birthday;

    public String getName() {
        return name;
    }

    public ArrayList<Genres> getAuthorGenres() {
        return authorGenres;
    }

    public void addAuthorGenres(Genres authorGenres) {
        this.authorGenres.add(authorGenres);
    }

    public Date getBirthday() {
        return birthday;
    }

    public Author(String name, Genres authorGenres, Date birthday) {
        this.name = name;
        this.authorGenres=new ArrayList<>();
        this.authorGenres.add(authorGenres);
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        String genres="";
        for (Genres genre:authorGenres) {
            genres+=genre+", ";

        }
        genres=genres.trim().substring(0, genres.length()-2);
        return "Author{" + name  +
                ", authorGenres=" + genres +
                ", birthday=" + birthday.toGMTString();
    }
}

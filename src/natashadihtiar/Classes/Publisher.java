package natashadihtiar.Classes;

public class Publisher {
    String title;
    String wepage;
    int year;

    public Publisher(String title, String wepage, int year) {
        this.title = title;
        this.wepage = wepage;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Publisher{" + this.title +
                ", wepage='" + this.wepage +
                ", year=" + this.year;
    }
}

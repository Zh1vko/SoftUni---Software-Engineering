package _03_ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    private String title;
	private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthors(String... authors) {
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }


    @Override
    public int compareTo(Book o) {
       int titleCompare = this.title.compareTo(o.title);

       if (titleCompare != 0)    {
           return titleCompare;
       }

       return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + authors +
                '}';
    }
}

package _04_BookComparator;

import java.util.*;

public class Book implements Iterator<Book>{

    private Book[] books;
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


    int index = 0;
    @Override
    public boolean hasNext() {
        return index < books.length;
    }


    @Override
    public Book next() {
        return books[index++];
    }

}


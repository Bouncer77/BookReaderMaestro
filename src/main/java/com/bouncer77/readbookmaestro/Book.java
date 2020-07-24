package com.bouncer77.readbookmaestro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 23.07.2020
 */

public class Book {


    /**
     * Словарь хранит: язык-имя
     * */
    private Map<String, String> bookName = new HashMap<>();
    private int edition;
    private Map<String, String> author = new HashMap<>();
    // private Map<String, List<String>> publishingHouse = new HashMap<>(); // издательство
    private int yearOfPublicationOfTheBook;
    private int lastPage; // последняя страница

    public Book(String locale, String bookName, String author) {
        this.bookName.put(locale, bookName);
        this.author.put(locale, author);
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

   /* public void setPublishingHouse(String language, String publishingHouse) {
        this.publishingHouse.put(language, );
    }*/

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public void addTranslation(String language, String bookName, String author) {
        this.bookName.put(language, bookName);
        this.author.put(language, author);
    }

    public int getLastPage() {
        return lastPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", edition=" + edition +
                ", author='" + author + '\'' +
                //", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublicationOfTheBook=" + yearOfPublicationOfTheBook +
                ", lastPage=" + lastPage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (edition != book.edition) return false;
        if (yearOfPublicationOfTheBook != book.yearOfPublicationOfTheBook) return false;
        if (lastPage != book.lastPage) return false;
        if (!bookName.equals(book.bookName)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + edition;
        result = 31 * result + author.hashCode();
        result = 31 * result + yearOfPublicationOfTheBook;
        result = 31 * result + lastPage;
        return result;
    }
}

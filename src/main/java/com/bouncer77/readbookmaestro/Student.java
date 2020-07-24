package com.bouncer77.readbookmaestro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 24.07.2020
 */

public class Student {

    Map<Book, Integer> currentBookAndPage = new HashMap<>();

    public Student(Map<Book, Integer> currentBookAndPage) {
        this.currentBookAndPage = currentBookAndPage;
    }

    public Student(Book book) {
        this.currentBookAndPage.put(book, 1);
    }

    public void addBook(Book book) {
        currentBookAndPage.put(book, 1);
    }

    public void addBook(Book book, int startPage) {
        currentBookAndPage.put(book, startPage);
    }

    public void addBook(List<Book> bookList) {
        List<Integer> startPageList = new ArrayList<>(bookList.size());
        for (int i = 0; i < bookList.size(); i++) {
            currentBookAndPage.put(bookList.get(i), 1);
        }
    }

}

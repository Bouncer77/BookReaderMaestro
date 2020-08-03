package com.bouncer77.readbookmaestro;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.bouncer77.readbookmaestro.Colour;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 24.07.2020
 */

public class Student {

    private String name;

    List<BookProgress> bookProgressList = new LinkedList<>();

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

    public String getProgress() {
        StringBuilder stringBuilder = new StringBuilder("Student: " + Colour.green(this.name) + "\n");
        for (BookProgress bookProgress : this.bookProgressList) {
            stringBuilder.append(bookProgress.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        for (Book book : course.bookList) {
            this.bookProgressList.add(new BookProgress(book));
        }
    }

    public void addBook(List<Book> bookList) {
        List<Integer> startPageList = new ArrayList<>(bookList.size());
        for (Book book : bookList) {
            currentBookAndPage.put(book, 1);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bookProgressList=" + bookProgressList +
                ", currentBookAndPage=" + currentBookAndPage +
                '}';
    }
}

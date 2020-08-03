package com.bouncer77.readbookmaestro;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 03.08.2020
 */

public class Course {

    String courseName;
    LocalDate startDate;
    LocalDate expiryDate;
    List<Book> bookList;

    public Course(String courseName, List<Book> bookList) {
        this.courseName = courseName;
        this.bookList = bookList;
    }
}

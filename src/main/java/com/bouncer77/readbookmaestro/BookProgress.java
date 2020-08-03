package com.bouncer77.readbookmaestro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 03.08.2020
 */

public class BookProgress {

    Book book;
    List<Commit> commitList = new LinkedList<>();

    public BookProgress(Book book) {
        this.book = book;
        commitList.add(new Commit(1, LocalDateTime.now(), "init"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookProgress that = (BookProgress) o;

        if (book != null ? !book.equals(that.book) : that.book != null) return false;
        return commitList != null ? commitList.equals(that.commitList) : that.commitList == null;
    }

    @Override
    public int hashCode() {
        int result = book != null ? book.hashCode() : 0;
        result = 31 * result + (commitList != null ? commitList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        StringBuilder res =  new StringBuilder("BookProgress{\n" +
                "book:" + book.getName() + "\n");

        int k = 1;
        for (Commit com : commitList) {
            res.append(k).append(" : ").append(com).append("\n");
        }
        return res.toString();
    }
}

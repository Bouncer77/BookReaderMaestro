package com.bouncer77.readbookmaestro;

import java.time.LocalDateTime;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 03.08.2020
 */

public class Commit {

    private int currentPage;
    private LocalDateTime dateTime;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Commit(int currentPage, LocalDateTime dateTime) {
        this.currentPage = currentPage;
        this.dateTime = dateTime;
        this.msg = "";
    }

    public Commit(int currentPage, LocalDateTime dateTime, String msg) {
        this.currentPage = currentPage;
        this.dateTime = dateTime;
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commit commit = (Commit) o;

        if (currentPage != commit.currentPage) return false;
        return dateTime != null ? dateTime.equals(commit.dateTime) : commit.dateTime == null;
    }

    @Override
    public int hashCode() {
        int result = currentPage;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "currentPage=" + currentPage +
                ", dateTime=" + dateTime +
                '}';
    }
}

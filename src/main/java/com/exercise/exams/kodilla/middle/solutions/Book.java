package com.exercise.exams.kodilla.middle.solutions;

public class Book {
    private String author;
    private String title;
    private int pubYear;

    public Book(String author, String title, int pubYear) {
        this.author = author;
        this.title = title;
        this.pubYear = pubYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPubYear() {
        return String.valueOf(pubYear);
    }

    public int getPublicationYear() {
        return pubYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
}

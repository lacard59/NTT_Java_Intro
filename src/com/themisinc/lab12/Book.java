package com.themisinc.lab12;

/**
 * Created by Administrator on 6/10/2014.
 */
public class Book extends Item {
    private String author;
    private int numPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public Book(int id, String name, String desc, double cost, double weight, String author, int numPages) {
        super(id, name, desc, cost, weight);
        this.author = author;
        this.numPages = numPages;
    }

    public Book(int id, String name, String author, int numPages) {
        super(id, name);
        this.author = author;
        this.numPages = numPages;
    }

    public Book(){
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numPages=" + numPages +
                "} " + super.toString();
    }


}

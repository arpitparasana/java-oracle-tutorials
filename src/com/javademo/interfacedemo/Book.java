package com.javademo.interfacedemo;

public class Book implements Comparable {

    private int numPages;

    public Book(int numPages) {
        this.numPages = numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }
    
    @Override
    public boolean isLargerThan(Comparable r) {
        Book otherBook = (Book) r;
        if(this.numPages > otherBook.numPages) {
            return true;
        }
        return false;
    }
}

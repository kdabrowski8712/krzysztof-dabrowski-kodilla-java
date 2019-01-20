package com.kodilla.patterns.prototype.library;
import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.name = this.name;
        clonedLibrary.books = new HashSet<>();
        for(Book actualBook : books) {

            Book clonedBook = new Book(actualBook.getTitle(),actualBook.getTitle(),actualBook.getPublicationDate());
            clonedLibrary.books.add(clonedBook);
        }

        return clonedLibrary;
    }


}
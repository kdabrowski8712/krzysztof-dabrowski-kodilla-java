package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Book newBook1 = new Book("W pustyni i w puszczy","Sienkiewicz", LocalDate.of(2010,05,20));
        Book newBook2 = new Book("Wladca Pierscieni","Tolkien", LocalDate.of(2012,10,5));

        Library testLibrary = new Library("Main library");
        testLibrary.getBooks().add(newBook1);
        testLibrary.getBooks().add(newBook2);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = testLibrary.shallowCopy();
            clonedLibrary.setName("Main library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // making deep copy of an object

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = testLibrary.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        testLibrary.getBooks().remove(newBook1);
        //Then

        System.out.println(testLibrary.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());

        Assert.assertEquals(1,testLibrary.getBooks().size());
        Assert.assertEquals(1,clonedLibrary.getBooks().size());
        Assert.assertEquals(2,deepClonedLibrary.getBooks().size());

        Assert.assertEquals(testLibrary.getName(),clonedLibrary.getName());
        Assert.assertEquals(clonedLibrary.getBooks(),testLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(),testLibrary.getBooks());
    }
}

package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> books = new HashSet<>();

        Book book1 = new Book("author1","title1",2000,"sig1");
        Book book2 = new Book("author2","title2",2001,"sig2");
        Book book3 = new Book("author3","title3",2002,"sig3");
        Book book4 = new Book("author4","title4",2003,"sig4");
        Book book5 = new Book("author5","title5",2004,"sig5");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        //When

        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2002,median);
        //Then


    }
}

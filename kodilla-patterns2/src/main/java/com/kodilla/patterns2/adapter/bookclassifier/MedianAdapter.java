package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookDetails;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> books) {

        Map<BookSignature,BookDetails> booksMap = new HashMap<>();

        Iterator<Book> bookIterator = books.iterator();

        while (bookIterator.hasNext()) {

            Book actBook = bookIterator.next();

            BookSignature bookSignature = new BookSignature(actBook.getSignature());
            BookDetails bookDetails = new BookDetails(
                    actBook.getAuthor(),
                    actBook.getTitle(),
                    actBook.getYearOfPublication()
            );

            booksMap.put(bookSignature,bookDetails);
        }

        return medianPublicationYear(booksMap);
    }
}

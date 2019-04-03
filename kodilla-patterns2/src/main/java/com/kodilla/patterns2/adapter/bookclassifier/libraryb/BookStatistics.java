package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookDetails> books);
    int medianPublicationYear(Map<BookSignature, BookDetails> books);
}

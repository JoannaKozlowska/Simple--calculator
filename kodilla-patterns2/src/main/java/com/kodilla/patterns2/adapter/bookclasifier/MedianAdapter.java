package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public final class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookHashMap = new HashMap<>();
        for (Book mp : bookSet) {
            bookHashMap.put(new BookSignature(mp.getSignature())
                    , new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book
                            (mp.getAuthor(), mp.getTitle(), mp.getPublicationYear()));
        }
        return medianPublicationYear(bookHashMap);
    }
}

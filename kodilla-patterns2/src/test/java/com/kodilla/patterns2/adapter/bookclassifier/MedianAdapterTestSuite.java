package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("J. Austen", "Sense and Sensibility", 1814, "WJ41");
        Book book2 = new Book("F.Herbert", "Dune", 1980, "BL32");
        Book book3 = new Book("J.R.R Tolkien", "Hobbit", 1950, "W241");
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1950, median);
    }
}

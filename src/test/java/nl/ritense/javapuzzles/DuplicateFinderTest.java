package nl.ritense.javapuzzles;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class DuplicateFinderTest {


    /**
     * Find all duplicates in the array in order of appearance
     */
    @Test
    public void shouldFindDuplicates() {
        int[] arrayWithDuplicates = {1, 1, 3, 5, 5, 8, 8, 12, 1, 3, 14, 30, 4, 32, 4, 12, 1, 7, 8, 0, 2, 6, 7, 20, 20, 21, 21, 23, 4, 6, 7, 8};

        DuplicateFinder duplicateFinder = new DefaultDuplicateFinder();
        Integer[] dups = duplicateFinder.findDuplicates(arrayWithDuplicates);


        assertEquals("length", 16, dups.length);
        assertThat(dups, hasItemInArray(1));
        assertThat(dups, hasItemInArray(3));
        assertThat(dups, hasItemInArray(5));
        assertThat(dups, hasItemInArray(8));
        assertThat(dups, hasItemInArray(12));
        assertThat(dups, hasItemInArray(20));

        assertTrue(dups[0].equals(Integer.valueOf(1)));
        assertTrue(dups[15].equals(Integer.valueOf(8)));

    }
}
package nl.ritense.javapuzzles;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class DuplicateFinderTest {


    @Test
    public void shouldFindDuplicates() {
        int[] arrayWithDuplicates = {1, 1, 3, 5, 5, 8, 8, 12, 1, 3, 14, 30, 4, 32, 4, 1, 7, 8, 0, 2, 6, 7, 20, 20, 21, 21, 23, 4, 6, 7, 8};

        DuplicateFinder duplicateFinder = new DefaultDuplicateFinder();
        Integer[] unduppedArray = duplicateFinder.findDuplicates(arrayWithDuplicates);


        assertEquals("length", 16, unduppedArray.length);
        assertThat(unduppedArray, hasItemInArray(1));
        assertThat(unduppedArray, hasItemInArray(3));
        assertThat(unduppedArray, hasItemInArray(5));
        assertThat(unduppedArray, hasItemInArray(8));
        assertThat(unduppedArray, hasItemInArray(12));
        assertThat(unduppedArray, hasItemInArray(20));

    }
}
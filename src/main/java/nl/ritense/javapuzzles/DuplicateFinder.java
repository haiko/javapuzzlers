package nl.ritense.javapuzzles;

public interface DuplicateFinder {


    /**
     * Finds duplicates in array and returns duplicates in an array in order found.
     * The returning array must not be deduplicated itself.
     *
     * So for an array with 1,3,3,5,8,9,1,7,8,9,8
     *
     * the returning array would be 3,1,8,9,8
     * @param duplicatesArray
     * @return
     */
    Integer[] findDuplicates(int[] duplicatesArray);
}

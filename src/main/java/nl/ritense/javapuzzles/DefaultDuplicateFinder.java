package nl.ritense.javapuzzles;

import java.util.HashSet;
import java.util.Set;

public class DefaultDuplicateFinder implements DuplicateFinder {


    @java.lang.Override
    public Integer[] findDuplicates(int[] duplicatesArray) {

        Set<Integer> tempSet = new HashSet();

        for (int i=0; i< duplicatesArray.length;i++){
            int j = duplicatesArray[i];
            tempSet.add(j);
        }
        
        return tempSet.toArray(new Integer[0]);
    }
}

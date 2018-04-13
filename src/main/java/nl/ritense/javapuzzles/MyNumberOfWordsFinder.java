package nl.ritense.javapuzzles;

import java.util.*;

public class MyNumberOfWordsFinder implements NumberOfWordsFinder {


    @Override
    public List<WordNumber> findNumberOfUniqueWords(String txt) {
        String[] words =  txt.split("\\s");

        Map<String, Integer> wordMap = new HashMap<>();


        for (int i = 0; i < words.length ; i++) {
            String word = words[i];

            if(wordMap.containsKey(word)) {
                Integer number  = wordMap.get(word);
                Integer plus =  number.intValue() + 1;
                wordMap.put(word, plus);
            }
            else {
                wordMap.put(word, new Integer(1));
            }
        }


        List<WordNumber> wordNumberList = new ArrayList<>();
        Set<String> wordSet =  wordMap.keySet();

        for (String word:wordSet) {
            wordNumberList.add(new WordNumber(word, wordMap.get(word).intValue()));
        }

        return wordNumberList;
    }
}

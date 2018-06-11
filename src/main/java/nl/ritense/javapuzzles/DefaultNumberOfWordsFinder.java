package nl.ritense.javapuzzles;

import org.springframework.util.StringUtils;

import java.util.*;

public class DefaultNumberOfWordsFinder implements NumberOfWordsFinder {

    @Override
    public List<WordNumber> findNumberOfUniqueWords(String txt) {

        //TODO implement solution here

        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = txt.split("\\s");

        for(int i=0; i < words.length; i++){
            String word = words[i];
            if(StringUtils.hasText(word)){
                Integer countWord = 1;
                if(wordMap.containsKey(word)){
                    countWord = wordMap.get(word) + 1;
                }
                wordMap.put(word, countWord);
            }
        }

        List<WordNumber> wordNumberList = new ArrayList<>();

        Set<String> wordSet = wordMap.keySet();

        for (String word: wordSet) {
            wordNumberList.add(new WordNumber(word, wordMap.get(word)));
        }
        return wordNumberList;
        //return new ArrayList<>();
    }
}

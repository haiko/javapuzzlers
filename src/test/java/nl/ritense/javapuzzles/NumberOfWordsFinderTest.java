package nl.ritense.javapuzzles;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class NumberOfWordsFinderTest {

    private String fileName = "wilhelmus.txt";

    @Test
    public void findNumberOfUniqueWords() throws IOException {
        // read and clean on non characters
        String rawTxt = IOUtils.toString(new ClassPathResource(fileName).getInputStream(), "UTF-8");
        String txt = rawTxt.replace(".", "").replace(",", "").replace("'", "");

        NumberOfWordsFinder numberOfWordsFinder = new DefaultNumberOfWordsFinder();

        List<WordNumber> uniqueWords = numberOfWordsFinder.findNumberOfUniqueWords(txt);

        assertEquals("number of unique words", 294, uniqueWords.size());

        for (WordNumber wordNumber: uniqueWords) {
            if(wordNumber.getWord().equals("die")){
                assertEquals(7, wordNumber.getNumber());
            }
        }
    }
}
package nl.ritense.javapuzzles;

import java.util.Objects;

public class WordNumber {

    private final String word;

    private final int number;

    public WordNumber(String word, int number){
        this.word = word;
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordNumber that = (WordNumber) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}

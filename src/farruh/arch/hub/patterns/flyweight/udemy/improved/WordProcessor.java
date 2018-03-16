package farruh.arch.hub.patterns.flyweight.udemy.improved;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {

    List<Letter> wordProcessor = new ArrayList<>();

    public void addLetter(Letter letter){
        wordProcessor.add(letter);
    }

    public void printLetters(){
        for (Letter letter: wordProcessor) {
            System.out.println(letter.getValue());
        }
    }
}

package lesson4.homework4;

import java.util.HashMap;
import java.util.Map;

public class WordsArray {
    private String [] wordsArray;

    public WordsArray(String[] wordsArray) {
        this.wordsArray = wordsArray;
    }

    public void doWordsArray() {
        HashMap<String,Integer> mapWords = getMapWords(wordsArray);
        for (Map.Entry entry: mapWords.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapWords(String[] wordsArray) {
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (mapWords.containsKey(wordsArray[i])) {
                mapWords.put(wordsArray[i], mapWords.get(wordsArray[i]) + 1);
            }
            else {
                mapWords.put(wordsArray[i],1);
            }
        }
        return mapWords;
    }
}

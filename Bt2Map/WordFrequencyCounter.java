package Bt2Map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is an apple. This is an orange";
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (wordFrequencyMap.containsKey(lowercaseWord)) {
                wordFrequencyMap.put(lowercaseWord, wordFrequencyMap.get(lowercaseWord) + 1);
            } else {
                wordFrequencyMap.put(lowercaseWord, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

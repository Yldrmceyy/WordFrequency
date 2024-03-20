import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write a text:");
        String text = input.nextLine();

        // Split text into words
        String[] arrayText = text.split(" ");

        //Creating a HashMap to store words
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : arrayText) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
            System.out.println(wordCountMap);
        }

        // Finding most frequent word
        int maxFrequency = 0;
        String mostMentionedWord = null;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostMentionedWord = entry.getKey();
            }
        }
        // Printing result
        System.out.println("Most frequent word: " + mostMentionedWord + " Count: " + maxFrequency);
    }
}
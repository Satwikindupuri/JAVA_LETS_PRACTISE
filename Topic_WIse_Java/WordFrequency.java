import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new LinkedHashMap<>();

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Remove punctuation and make all lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split sentence into words
        String[] words = input.split("\\s+");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + map);

        TreeSet<String> uniqueWords = new TreeSet<>();
        System.out.println("Unique words in the sentence are: ");
        for(String key:map.keySet())
        {
            if(map.get(key)==1)
            {
                uniqueWords.add(key);
            }
        }
        System.out.println(uniqueWords);

        // Find the word with the highest frequency
        String mostFrequentWord = null;
        int highestFrequency = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > highestFrequency) {
            highestFrequency = map.get(key);
            mostFrequentWord = key;
            }
        }
        System.out.println("Word with the highest frequency: " + mostFrequentWord + " (Frequency: " + highestFrequency + ")");


        for(String key:map.keySet())
        {
            if(map.get(key)!=1)
            {
                System.out.println(key+" "+map.get(key));
            }
        }
        sc.close();
    }
}

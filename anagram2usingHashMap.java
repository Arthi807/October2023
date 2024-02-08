package com.hackathon.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram2usingHashMap {

    public static List<List<String>> extractAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            // Convert the word to a representative structure (sorted characters)
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the Map already contains this representative structure
            if (anagramMap.containsKey(sortedWord)) {
                // If yes, add the word to the existing list
                anagramMap.get(sortedWord).add(word);
            } else {
                // If no, create a new list with the word and put it in the Map
                List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                anagramMap.put(sortedWord, anagramList);
            }
        }

        // Retrieve anagram groups from the Map
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "tea", "eat", "ate"};

        List<List<String>> anagramGroups = extractAnagrams(words);

        // Print the result
        for (List<String> group : anagramGroups) {
            System.out.println("Anagram Group: " + group);
        }
    }
}

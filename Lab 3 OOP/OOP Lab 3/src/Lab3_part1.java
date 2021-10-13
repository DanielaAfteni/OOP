import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Lab3_part1 {

    public static void main(String[] args) {

        // PART 1

        // A huge text (hardcoded in a variable)
        String text = "Reading practice to help you understand simple information, words and sentences about known topics. Texts include posters, messages, forms and timetables. Reading practice to help you understand simple texts and find specific information in everyday material. Texts include emails, invitations, personal messages, tips, notices and signs.";

        TextManipulator textManipulator = new TextManipulator(text);

        // Calculate the nr. of words by the int function responsible for its counting
        int nrOfWords = textManipulator.getNumberOfWords();

        // Calculate the nr. of sentences by the int function responsible for its counting
        int nrOfSentences = textManipulator.getNumberOfSentences();

        // PART 2

        // Calculate the nr. of letters by the int function responsible for its counting
        int nrOfLetters = textManipulator.numberOfLetters();

        // Calculate the nr. of vowels by the int function responsible for its counting
        int nrOfVowels = textManipulator.numberOfVowels();

        // Calculate the nr. of consonants by decreasing the nr. of letters with nr. of vowels
        int nrOfCons = nrOfLetters - nrOfVowels;

        // Prompt in console every calculated nr. of: words, sentences, letters, vowels and consonants
        System.out.println("Number of words: " + nrOfWords);
        System.out.println("Number of sentences: " + nrOfSentences);
        System.out.println("Number of lettters: " + nrOfLetters);
        System.out.println("Number of vowels: " + nrOfVowels);
        System.out.println("Number of consonants: " + nrOfCons);

        // PART 3

        // Firstly, we change the current text to lower case, so as to be able to consider the words written by up case (CapsLock)
        String textn = text.toLowerCase();
        // We use the string function remove, in order to take of the end points of the sentences
        String text0 = remove(textn,".");
        // Create a HashMap object called map
        Map<String, Integer> map = new HashMap<>();
        for (String word : text0.split(" ")) {
            // In case if the word is not available
            if (map.get(word) == null) {
                // we set that it is repeated just ones
                map.put(word,1);
            }
            else {
                map.put(word,map.get(word) + 1);
            }
        }
        // Define the most repeated word Top 1 by its maximum value of repetition
        String repeatedWord = Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
        // Prompt in console the most repeated word Top 1, how many times it was repeated and its length
        System.out.println("Top 1 most often word is: - " + repeatedWord + " - which is repeated " + map.get(repeatedWord) + " has length " + repeatedWord.length());
        // In order to select the next word in the top 5 repeated words, we remove the top-1-word
        String text1 = remove(text0,repeatedWord);
        // and create a new HashMap object called map1
        Map<String, Integer> map1 = new HashMap<>();
        for (String word : text1.split(" ")) {
            // In case if the word is not available
            if (map1.get(word) == null) {
                // we set that it is repeated just ones
                map1.put(word,1);
            }
            else {
                map1.put(word,map1.get(word) + 1);
            }
        }
        // Define the most repeated word Top 2 by its maximum value of repetition
        String repeatedWord1 = Collections.max(map1.entrySet(),Map.Entry.comparingByValue()).getKey();
        // Prompt in console the most repeated word Top 2, how many times it was repeated and its length
        System.out.println("Top 2 most often word is: - " + repeatedWord1 + " - which is repeated " + map1.get(repeatedWord1) + " has length " + repeatedWord1.length());
        // In order to select the next word in the top 5 repeated words, we remove the top-2-word
        String text2 = remove(text1,repeatedWord1);
        // and create a new HashMap object called map2
        Map<String, Integer> map2 = new HashMap<>();
        for (String word : text2.split(" ")) {
            // In case if the word is not available
            if (map2.get(word) == null) {
                // we set that it is repeated just ones
                map2.put(word,1);
            }
            else {
                map2.put(word,map2.get(word) + 1);
            }
        }
        // Define the most repeated word Top 3 by its maximum value of repetition
        String repeatedWord2 = Collections.max(map2.entrySet(),Map.Entry.comparingByValue()).getKey();
        // Prompt in console the most repeated word Top 3, how many times it was repeated and its length
        System.out.println("Top 3 most often word is: - " + repeatedWord2 + " - which is repeated " + map2.get(repeatedWord2) + " has length " + repeatedWord2.length());
        // In order to select the next word in the top 5 repeated words, we remove the top-3-word
        String text3 = remove(text2,repeatedWord2);
        // and create a new HashMap object called map3
        Map<String, Integer> map3 = new HashMap<>();
        for (String word : text3.split(" ")) {
            // In case if the word is not available
            if (map3.get(word) == null) {
                // we set that it is repeated just ones
                map3.put(word,1);
            }
            else {
                map3.put(word,map3.get(word) + 1);
            }
        }
        // Define the most repeated word Top 4 by its maximum value of repetition
        String repeatedWord3 = Collections.max(map3.entrySet(),Map.Entry.comparingByValue()).getKey();
        // Prompt in console the most repeated word Top 4, how many times it was repeated and its length
        System.out.println("Top 4 most often word is: - " + repeatedWord3 + " - which is repeated " + map3.get(repeatedWord3) + " has length " + repeatedWord3.length());
        // In order to select the next word in the top 5 repeated words, we remove the top-4-word
        String text4 = remove(text3,repeatedWord3);
        // and create a new HashMap object called map4
        Map<String, Integer> map4 = new HashMap<>();
        for (String word : text4.split(" ")) {
            // In case if the word is not available
            if (map4.get(word) == null) {
                // we set that it is repeated just ones
                map4.put(word,1);
            }
            else {
                map4.put(word,map4.get(word) + 1);
            }
        }
        // Define the most repeated word Top 5 by its maximum value of repetition
        String repeatedWord4 = Collections.max(map4.entrySet(),Map.Entry.comparingByValue()).getKey();
        // Prompt in console the most repeated word Top 5, how many times it was repeated and its length
        System.out.println("Top 5 most often word is: - " + repeatedWord4 + " - which is repeated " + map4.get(repeatedWord4) + " has length " + repeatedWord4.length());

        // We create the string function for comparison of the lengths of the listed top 5 words
        String comp1 = compare(repeatedWord, repeatedWord1);
        String comp2 = compare(comp1, repeatedWord2);
        String comp3 = compare(comp2, repeatedWord3);
        String comp4 = compare(comp3, repeatedWord4);
        // We show in the console the longest word from the top 5 repeated words
        System.out.println("The longest repeated word from top 5 is: - " + comp4 + " - with length " + comp4.length());

    }

    // String function responsible for the removal of character sequences which should not be considered any more
    static String remove(String str, String word) {
        // Split the string using split() method
        String msg[] = str.split("\\s+|,\\s*|\\.\\s*");
        String new_str = "";

        // Itearating the string using for each loop
        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {

                // Concate the word not equal to the given word
                new_str += words + " ";
            }
        }

        // Return the new String
        return new_str;
    }

    // String function responsible for the comparison of the string's lengths
    static String compare(String s1, String s2) {
        if (s1.length() >= s2.length()) return s1;
        // Returns the longest string
        else return s2;
    }

}


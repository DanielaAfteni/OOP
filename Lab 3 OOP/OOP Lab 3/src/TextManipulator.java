import java.util.Locale;

// PART 1

// The class responsible for every text manipulations

public class TextManipulator {
    private String text;

    TextManipulator(String text) {
        this.text = text;
    }

    // int function responsible for its counting of the words
    int getNumberOfWords() {
        String[] tokens = text.split("\\s+");
        return tokens.length;
    }

    // int function responsible for its counting of the sentences
    int getNumberOfSentences() {
        String[] parts = text.split("[!?.:]+");
        return parts.length;
    }

    // PART 2

    // int function responsible for its counting of the letters
    int numberOfLetters() {
        String newtext = text.toLowerCase();
        int letterind = 0;
        int lettersResult = 0;
        char let;
        for (int i = 0; i < newtext.length(); i++) {
            let = newtext.charAt(i);
            letterind = (int) let - 'a';  // for example 'a': 97 - 97 = 0
            if ((letterind >= 0) && (letterind < 26)) lettersResult++;
        }
        return lettersResult;
    }

    // int function responsible for its counting of the vowels
    int numberOfVowels() {
        String newtext1 = text.toLowerCase();
        int vowelind = 0;
        int vowelResult = 0;
        char vow;
        for (int i = 0; i < newtext1.length(); i++) {
            vow = newtext1.charAt(i);
            vowelind = (int) vow - 'a'; // for example 'e': 101 - 97 = 4
            if ((vowelind == 0) || (vowelind == 4) || (vowelind == 8) || (vowelind == 14) || (vowelind == 20)) vowelResult++;
        }
        return vowelResult;
    }

}

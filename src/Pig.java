import java.util.*;

public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        
        // pseudocode
        // take in sentence, break into chars
        // if first char vowel, return
        // if multiple chars, take first, add to end
        // add ay and return

        // vowel set
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');

        // array of words in sentence
        String[] splitSentence = sentence.split(" ");

        // iterate through each word
        for (int i = 0; i < splitSentence.length; i++) {

            // separate word from array
            String word = splitSentence[i];

            // capture first letter of word
            Character firstLetter = word.charAt(0);

            // if firstLetter isn't a vowel
            if (!vowelSet.contains(firstLetter)) {

                // if word is longer than 1 char
                if (word.length() > 1) {

                    // remove first letter
                    word = word.substring(1);

                    // add first letter to end
                    word += firstLetter;

                }

                // add "ay" to end
                word += "ay";

                // put word back in array
                splitSentence[i] = word;
            }
        }

        // return array joined back into sentence
        return String.join(" ", splitSentence);
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }

}
  
  
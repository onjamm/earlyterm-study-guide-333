import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int min = 0;
        int max = nums[0];

        for (int num : nums) {

            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        return max - min;
    }


    // TODO: Implement the other methods from the README AND tests for each one
    
   /**
    * Returns the longest word that starts with a character c
    * @param words non-empty array list of words
    * @param c 
    * @return longest word that starts with c
    */
    public static String longestWord(ArrayList<String> words, char c) {
        String longest = "";

        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (firstLetter == c) {
                if(word.length() > longest.length()) {
                    longest = word;
                }
            }
            
        }

        return longest;
    } 


    public static 

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}

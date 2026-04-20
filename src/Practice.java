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
     * 
     * @param words a non-empty arraylist of strings
     * @return the longest word in the array list
     */
    public static String longestWord(ArrayList<String> words) {
        String longest = "";

        for (String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    } 

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}

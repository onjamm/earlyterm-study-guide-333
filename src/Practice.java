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
        int difference = 0;

        for (int num : nums) {

            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        difference = max - min;
        return difference;
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
                    longest += word;
                }
            }
            
        }

        return longest;
    } 

    /**
     * Returns the number of words that are longer than n but less than m
     * @param words non-empty hashset of words
     * @param n only adds if greater then n
     * @param m only adds if less than m
     * @return counter of longerThanAndLessThan words
     */
    public static int longerThanAndLessThan(HashSet<String> words, int n, int m) {
        int counter = 0;

        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                counter++;
            }
        }        
        
        return counter;
    }

    /**
     * Return the difference between the amount of odd numbers and even numbers
     * (x = odd - even)
     * @param words HashMap of words
     * @return the difference between the amt of odd#'s and even #'s
     */
    public static int diffOfOddAndEven(HashMap<Integer, Integer> nums) {
        int difference = 0;
        int even = 0;
        int odd = 0;

        for (int num : nums.values()) {
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd +=1;
            }
        }

        difference = odd - even;

        return difference;
    }

    /**
     * Returns secondLargest number
     * @param nums non-empty HashMap of integers
     * @return the secondLargest number in the HashMap of integer keys and values
     */
    public static int secondLargest(HashMap<Integer, Integer> nums) {
        int max = 0;
        int secondLargest = 0;
        
        for (int num : nums.keySet()) {
            if (num > secondLargest && num < max) {
                secondLargest = max;
            } else if (num > max) {
                max = num;
            }
        }

        return secondLargest;
    }

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}

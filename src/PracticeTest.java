import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    
    @Test
    void maxDiffTest() {
        //Arrange
        int[] numbers = {10, 2, 5, 8, 100};

        // Act
        int actual = Practice.maxDiff(numbers);

        //Assert
        //Largest: 100, Smallest, 2, Difference: 98
        assertEquals(98, actual);
    }

    @Test 
    void longestWordTest() {
        //Arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("Bear");
        words.add("Grylls");
        words.add("Sagitarius");
        words.add("Lopez");
        words.add("Sanchez");
        words.add("Rick");

        //Act
        String actual = Practice.longestWordStartingWithC(words, 'S');

        //Assert 
        //Longest word is Sagitarius it should print that
        assertEquals("Sagitarius", actual);


    }

    @Test 
    void longerThanAndLessThanTest() {
        
        //Arrange 
        HashSet<String> set = new HashSet<>();
        set.add("Drew");
        set.add("Hoover");
        set.add("I");
        set.add("Leo");

        //Act
        int actual = Practice.longerThanAndLessThan(set, 2, 6);

        //Assert
        //Should print 2 (Drew, Leo)
        assertEquals(2, actual);

    }

    @Test
    void diffOfOddAndEvenTest() {

        //Arrange
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);

        //Act
        int actual = Practice.diffOfOddAndEven(map);

        //Assert
        //Should print 0, because 2 odds and 2 evens (x = 2 - 2)
        assertEquals(0, actual);

    }

    @Test 
    void secondLargestTest() {

        //Arrange 
        HashMap<Integer, Integer> nums = new HashMap<>();
        nums.put(99, 0);
        nums.put(67, 1);
        nums.put(22, 2);
        nums.put(43, 3);
        nums.put(200, 4);

        //Act
        int actual = Practice.secondLargest(nums);

        //Assert
        assertEquals(99, actual);
    }

    // TODO: Make tests for each problem you solve
    
}



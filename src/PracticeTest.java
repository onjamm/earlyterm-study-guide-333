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
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Bear");
        arr.add("Grylls");
        arr.add("Sagitarius");
        arr.add("Lopez");
        arr.add("Sanchez");
        arr.add("Rick");

        //Act
        String actual = Practice.longestWord(arr, 's');

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

    // TODO: Make tests for each problem you solve
    
}



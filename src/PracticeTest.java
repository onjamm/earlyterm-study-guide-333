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
        String actual = Practice.longestWord(arr);

        //Assert 
        //Longest word is Sagitarius it should print that
        assertEquals("Sagitarius", actual);


    }

    // TODO: Make tests for each problem you solve
    
}



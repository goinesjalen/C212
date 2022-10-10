package c212.src.Lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {
    @Test
    public void testingDuplicates(){
        int[] input1 = {0, 50, 40, 20, 30, 10};
        int[] actual = RemoveDuplicates.removal(input1);
        int[] output1 = {0, 10, 20, 30, 40, 50};
        assertArrayEquals(output1, actual);
        int[] input2 = {0, 50, 40, 20, 30, 10, 20, 10, 30, 40 , 40, 30, 20, 10, 50, 40, 10};
        int[] output2 = {0, 10, 20, 30, 40, 50};
        assertArrayEquals(output2, RemoveDuplicates.removal(input2));
        int[] input3 = {0, 0, 1, 1, 2, 2, 3, 4, 5, 2, 4, 6, 3, 2, 1, 4};
        int[] output3 = {0, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(output3, RemoveDuplicates.removal(input3));

    }
}

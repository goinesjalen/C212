package c212.src.Lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentDirectoryTest {
    @Test
    public void testingStudentDirectory1(){
        int[] expected1 = {1};
        int[] actual1 = StudentDirectory.Directory(18, -1, -1);
        assertArrayEquals(expected1, actual1);
    }
    @Test
    public void testingStudentDirectory2(){
        int[] expected2 = {1};
        int[] actual2 = StudentDirectory.Directory(18, -1, -1);
        assertArrayEquals(expected2, actual2);
    }

}

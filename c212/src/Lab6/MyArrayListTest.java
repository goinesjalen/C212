package c212.src.Lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    int[] test = {1,2,3};
    MyArrayList list3 = new MyArrayList(test);

    @Test
    public void testingAdd(){
        int[] exptest = {1,2,3,4};
        MyArrayList expected = new MyArrayList(exptest);
        list3.add(4);
        assertEquals(expected.toString(), list3.toString());
    }
    @Test
    public void testingRemove(){
        int[] exptest = {1,2,3,4};
        MyArrayList expected = new MyArrayList(exptest);
        expected.remove(3);
        assertEquals(expected.toString(), list3.toString());
    }
    @Test
    public void testingGetSize(){
        assertEquals(3, list3.getSize());
    }
    @Test
    public void testingIsEmpty(){
        assertEquals(false, list3.isEmpty());
    }
    @Test
    public void testingContains(){
        assertEquals(true, list3.contains(2));
        assertEquals(false, list3.contains(9));
    }
    @Test
    public void testingIndexOf(){
        assertEquals(-1, list3.indexOf(234));
        assertEquals(2, list3.indexOf(3));
    }
}

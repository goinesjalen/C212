package c212.src.Lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateJUnit {
    Date date1 =  new Date("10-15-2001");
    Date date2 =  new Date("10-26-2001");

    @Test
    public void testingConstructor(){
        assertEquals("10-15-2001", date1.getDate());
        assertEquals("10-26-2001", date2.getDate());
    }

    @Test
    public void testingGetters(){
        assertEquals(10, date2.getMonth());
        assertEquals(15, date1.getDay());
        assertEquals(26, date2.getDay());
        assertEquals(2001, date1.getYear());
    }
    public void testingSetters(){
        date2.setYear("1963");
        assertEquals(1963, date2.getYear());
    }
    @Test
    public void testingDifference(){
        assertEquals(date1.getDifferent(date2), 11);
        date2.setYear("2002");
        assertEquals(date1.getDifferent(date2), 376);
        date2.setDay("01");
        assertEquals(date1.getDifferent(date2), 351);
    }

    @Test
    public void failTestCase(){
        assertNotEquals(2002, date2.getYear());
    }
}

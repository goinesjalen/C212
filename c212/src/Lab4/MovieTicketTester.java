package c212.src.Lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketTester {

    @Test
    public void testingAgeRestriced(){
        assertEquals(false, MovieTicket.ageRestricted(1, "G"));
        assertEquals(false, MovieTicket.ageRestricted(12, "PG"));
        assertEquals(false, MovieTicket.ageRestricted(13, "PG13"));
        assertEquals(false, MovieTicket.ageRestricted(18, "R"));
        assertEquals(true, MovieTicket.ageRestricted(12, "PG13"));
        assertEquals(true, MovieTicket.ageRestricted(17, "R"));
    }

    @Test
    public void testingGetPrice(){
        assertEquals(5, MovieTicket.getPrice(5));
        assertEquals(9, MovieTicket.getPrice(14));
        assertEquals(12, MovieTicket.getPrice(20));
    }
}

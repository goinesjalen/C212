package c212.src.Lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantJUnit {
    Restaurant rest500 =  new Restaurant(500);
    Restaurant rest0 =  new Restaurant();

    @Test
    public void testingConstructor(){
        assertEquals(500, rest500.getBalance());
        assertEquals(0, rest0.getBalance());
    }

    @Test
    public void testingPurchases(){
        rest500.itemPurchase(300);
        assertEquals(200, rest500.getBalance());
    }
    public void testingSales(){
        rest500.itemSell(400);
        assertEquals(600, rest500.getBalance());
    }
    @Test
    public void failTestCase(){
        assertNotEquals(12, rest0.getBalance());
    }
}

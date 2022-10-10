package c212.src.Lab7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testingConstructor(){
        Savings sav = new Savings();
        Current cur = new Current();
        assertEquals(20000, sav.memberBalance);
        assertEquals(20000, cur.memberBalance);
    }
    @Test
    public void testingWithdraw(){
        Savings sav = new Savings();
        Current cur = new Current();
        sav.Withdraw(1000);
        cur.Withdraw(1000);
        assertEquals(18200, sav.memberBalance);
        assertEquals(19000, cur.memberBalance);
    }
    @Test
    public void testingdeposit(){
        Savings sav = new Savings();
        Current cur = new Current();
        sav.Deposit(1000);
        cur.Deposit(1000);
        assertEquals(21800, sav.memberBalance);
        assertEquals(21000, cur.memberBalance);
    }
}

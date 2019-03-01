package cs603.hw3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Periodic(period = 2)
public class TempTest {
    @Test
    @ExtendWith(PeriodicEnabling.class)
    public void testTrue() {
        assertTrue(true);
    }
    @Test
    @ExtendWith(PeriodicEnabling.class)
    public void testZero() {
        int val = 0; assertEquals(0, val);
    }
    @Test
    @ExtendWith(PeriodicEnabling.class)
    public void testZero2() {
        assertEquals(0, "".length());
    }
    @Test
    @ExtendWith(PeriodicEnabling.class)
    public void testFalse() {
        assertTrue(!false);
    }


}

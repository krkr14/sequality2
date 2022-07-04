package sequality;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        double delta = 1e-5;
        assertEquals(expected, calculate.sum(2, 3));
        assertEquals(2.5, calculate.ave(2, 3), delta);
        assertEquals(55, calculate.sumArray(1, 10));
        assertEquals(5.5, calculate.aveArray(1, 10), delta);
        // assertEquals(5.5, calculate.aveArray(10, 1), delta);
        assertEquals(25, calculate.sumOdd(1, 10));
        assertEquals(30, calculate.sumEven(1, 10));
    }
}
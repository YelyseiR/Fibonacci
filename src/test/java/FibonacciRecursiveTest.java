import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciRecursiveTest {

    @Test
    public void testFibonacci() {
        FibonacciRecursive fibCalculator = new FibonacciRecursive();

        assertEquals(0, fibCalculator.recursive(0));
        assertEquals(1, fibCalculator.recursive(1));
        assertEquals(1, fibCalculator.recursive(2));
        assertEquals(2, fibCalculator.recursive(3));
        assertEquals(3, fibCalculator.recursive(4));
        assertEquals(5, fibCalculator.recursive(5));
        assertEquals(8, fibCalculator.recursive(6));
        assertEquals(13, fibCalculator.recursive(7));
    }
}


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciIterativeTest {

    @Test
    public void testFibonacci() {
        FibonacciIterative fibCalculator = new FibonacciIterative();

        assertEquals(0, fibCalculator.iterative(0));
        assertEquals(1, fibCalculator.iterative(1));
        assertEquals(1, fibCalculator.iterative(2));
        assertEquals(2, fibCalculator.iterative(3));
        assertEquals(3, fibCalculator.iterative(4));
        assertEquals(5, fibCalculator.iterative(5));
        assertEquals(8, fibCalculator.iterative(6));
        assertEquals(13, fibCalculator.iterative(7));
    }
}


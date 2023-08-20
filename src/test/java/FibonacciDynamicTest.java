import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciDynamicTest {

    @Test
    public void testFibonacci() {
        FibonacciDynamic fibCalculator = new FibonacciDynamic();

        assertEquals(0, fibCalculator.dynamicProgramming(0));
        assertEquals(1, fibCalculator.dynamicProgramming(1));
        assertEquals(1, fibCalculator.dynamicProgramming(2));
        assertEquals(2, fibCalculator.dynamicProgramming(3));
        assertEquals(3, fibCalculator.dynamicProgramming(4));
        assertEquals(5, fibCalculator.dynamicProgramming(5));
        assertEquals(8, fibCalculator.dynamicProgramming(6));
        assertEquals(13, fibCalculator.dynamicProgramming(7));
    }
}


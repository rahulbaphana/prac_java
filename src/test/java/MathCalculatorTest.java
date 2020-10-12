import org.junit.jupiter.api.Test;

import static com.prac.calculator.MathCalculator.factorialOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathCalculatorTest {

    @Test
    void shouldCalculateFactorialForGivenNumber() {
        assertEquals(1, factorialOf(0));
        assertEquals(1, factorialOf(1));
        assertEquals(6, factorialOf(3));
        assertEquals(24, factorialOf(4));
    }
}

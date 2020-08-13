import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    @Test
    public void addition() {
        Calculator calculator = new Calculator();
        assertTrue("test is ok",calculator.calculate(1, 2, '+') == 3);
        assertFalse("test is false",calculator.calculate(1, 2, '+') == 4);
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        assertTrue("test is ok",calculator.calculate(1, 2, '*') == 2);
        assertFalse("test is false",calculator.calculate(1, 2, '*') == 4);
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        assertTrue("test is ok",calculator.calculate(1, 2, '/') == 0.5);
        assertFalse("test is false",calculator.calculate(1, 2, '/') == 4);
        assertFalse("test is false",calculator.calculate(1, 0, '/') == 4);
    }

    @Test
    public void substraction() {
        Calculator calculator = new Calculator();
        assertTrue("test is ok",calculator.calculate(1, 2, '-') == -1);
        assertFalse("test is false",calculator.calculate(1, 2, '-') == 4);
    }

    @Test
    public void exponentiation() {
        Calculator calculator = new Calculator();
        assertTrue("test is ok",calculator.calculate(1, 2, '^') == 1);
        assertTrue("test is ok",calculator.calculate(5, 3, '^') == 125);
        assertFalse("test is false",calculator.calculate(1, 2, '^') == 4);
    }
}
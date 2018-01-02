import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void add() {
        Calculator calculator = new Calculator();
        int first = 1;
        int second = 2;
        calculator.add(first, second);
        int expected = 3;
        assertEquals(expected, calculator.getResult());
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator();
        int first = 2;
        int second = 1;
        calculator.minus(first, second);
        int expected = 1;
        assertEquals(expected, calculator.getResult());
    }

    @Test
    void cleanResult() {
        Calculator calculator = new Calculator();
        int first = 1;
        int second = 2;
        calculator.add(first, second);
        int expected = 0;
        calculator.cleanResult();
        assertEquals(expected, calculator.getResult());
    }

}
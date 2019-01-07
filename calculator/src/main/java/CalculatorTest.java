import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(1, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(27, calculator.multiply(9, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.divide(50, 10), 0.1);
    }
}

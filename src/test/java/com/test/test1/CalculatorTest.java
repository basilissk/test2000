package com.test.test1;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CalculatorTest {
    @Test
    public void isTwoPlusThreeEqualsFive(){
        assertEquals(5, Calculator.addTwoNumbers(2, 3));
    }
}

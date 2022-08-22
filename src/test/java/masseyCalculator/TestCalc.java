package masseyCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    void addTwoNumbersWorks() {
        Assertions.assertEquals(3, Calc.add(1, 2));
    }
}
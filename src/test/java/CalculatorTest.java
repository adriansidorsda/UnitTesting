import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculateIncome(){
        //when
        int grossIncome = 10000;
        int tax = 19;

        //given
        double result = calculator.calculateIncome(grossIncome, tax);

        //then
        assertEquals(8100.0, result,0);
    }

    @Test
    public void testCalculate(){
        //given
        int a =2;;
        int b=2;

        //when
        int result = calculator.calculate(a,b);

        //then
        assertEquals(4, result);
        assertThat(result).as("testujemy dodawanie").isEqualTo(4).isLessThan(5);

    }

    @Test
    public void calculateShouldReturnFiveWhenThreeAndTwo() {
        //given
        int a = 3;
        int b = 2;

        //when
        int result = calculator.calculate(a,b);

        //then
        assertEquals(5, result);
    }

    @Test
    @Parameters({"1,2,3",
                "4,5,9",
                "9,1,10"})
    public void testCalculate(int a, int b, int expected) {
        //when
        int result = calculator.calculate(a,b);

        //then
        assertEquals(expected, result);
    }

    @Test
    @Parameters(method = "generateData")
    public void testCalculate2(int a, int b, int expected) {
        //when
        int result = calculator.calculate(a,b);

        //then
        assertEquals(expected, result);
    }

    public Object[] generateData() {
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{4,5,9},
                new Object[]{9,1,10}
        };
    }



}
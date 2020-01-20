import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private Calculator calculator;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup() {
        calculator = new Calculator();
    }


    @Test(expected = IllegalArgumentException.class)
    public void testThrowIAEWithTestParameter() {

        calculator.calculate(null, 2);
    }

    @Test
    public void testCalculateThrowIAEWhenParamIsNull() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Parametr nie może być nullem!");

        calculator.calculate(null, 2);
    }

    @Test
    public void testThrowIAEWithRuleAnnotation() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Parametr nie może być nullem!");

        calculator.calculate(null, 2);
    }

    @Test
    public void testThrowIAEWhenAEqualsZero(){
        try {
            calculator.calculate(null, 2);
            fail();
        } catch (Exception e) {
            assertThat(e)
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Parametr nie może być nullem!");
        }
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
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    @Parameters({"0,0",
                "1,1",
                "2,1",
                "3,2"})
    public void testCompute(int a, int expected) {
        //when
        int result = fibonacci.compute(a);

        //then
        assertEquals(expected, result);
    }

}
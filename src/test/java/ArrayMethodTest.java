import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayMethodTest {

    private ArrayMethod arrayMethod;

    @Before
    public void setup() {
        arrayMethod = new ArrayMethod();
    }

    @Test
    public void checkIfValuesOnTheSamePositionReturnThreeWhen(){
        //given
        List<Integer> list = Arrays.asList(1,2,3,4);
        int[] array = new int[]{0,2,3,4};

        //when
        int result = arrayMethod.checkIfValuesOnTheSamePositonAreEquals(list,array);

        //then
        assertEquals(3, result);
    }

    @Test
    public void checkIfValuesOnTheSamePositionReturnThreeWhen2(){
        //given
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int[] array = new int[]{0,2,3,4};

        //when
        int result = arrayMethod.checkIfValuesOnTheSamePositonAreEquals(list,array);

        //then
        assertEquals(3, result);
    }

    @Test
    public void checkIfValuesOnTheSamePositionReturnThreeWhen3(){
        //given
        List<Integer> list = Arrays.asList(1,2,3,4);
        int[] array = new int[]{0,2,3,4,5};

        //when
        int result = arrayMethod.checkIfValuesOnTheSamePositonAreEquals(list,array);

        //then
        assertEquals(3, result);
    }

}
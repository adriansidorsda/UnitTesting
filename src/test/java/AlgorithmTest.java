import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class AlgorithmTest {

    private Algorithm algorithm;

    @Before
    public void setup() {
        algorithm = new Algorithm();
    }

    @Test
    @Parameters(method = "generateData")
    public void testFindMinPositiveNumber(List<Integer> list, int expected) {
        //when
       int result =  algorithm.findMinPositiveNumberWhichNotExistsInList(list);

       //then
        assertEquals(expected, result);
    }


    public Object[] generateData() {
        return new Object[]{
                new Object[]{Arrays.asList(-2,-3,-6,1,2,3,4), 5},
                new Object[]{Arrays.asList(-2,-3,-6,-1),1},
                new Object[]{Arrays.asList(1,2,3,4,5), 6}
        };
    }


    @Test
    public void findMinPositiveWhen3() {
        //given
        List<Integer> list = Arrays.asList(-2,-3,-6,1,2,3,4);

        //when
        int result = algorithm.findMinPositiveNumberWhichNotExistsInList(list);

        //then
        assertEquals(5, result);
    }

    @Test
    public void findMinPositiveWhen4() {
        //given
        List<Integer> list = Arrays.asList(-2,-3,-6,-1);

        //when
        int result = algorithm.findMinPositiveNumberWhichNotExistsInList(list);

        //then
        assertEquals(1, result);
    }

    @Test
    public void findMinPositiveWhen5() {
        //given
        List<Integer> list = Arrays.asList(0,2,2,2,2,1,1,1,1,3,3,3,3,5,5,5,5);

        //when
        int result = algorithm.findMinPositiveNumberWhichNotExistsInList(list);

        //then
        assertEquals(4, result);
    }

    @Test
    public void findMinPositiveWhen6() {
        //given
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //when
        int result = algorithm.findMinPositiveNumberWhichNotExistsInList(list);

        //then
        assertEquals(6, result);
    }



}
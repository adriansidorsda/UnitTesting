import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarAdvisorTest {

    private CarAdvisor carAdvisor;

    @Before
    public void setup() {
        carAdvisor = new CarAdvisor();
    }

    @Test
    public void shouldReturnRowerWhenAgeIs17() {
        //given
        int age = 17;

        //when
        Vehicle result =carAdvisor.advise(age);

        //then
        assertEquals(Vehicle.ROWER, result);
    }

    @Test
    public void shouldReturnRowerWhenAgeIs22() {
        //given
        int age = 22;

        //when
        Vehicle result =carAdvisor.advise(age);

        //then
        assertEquals(Vehicle.FIAT, result);
    }

}
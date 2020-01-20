import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UserTest {

    private User user;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setup() {
        user = new User();
    }

    @Test
    public void testCheckNameWhenUsernameIs3() {
        //given
        String username = "abc";
        //when
       boolean result = user.checkName(username);
        //then
        assertTrue(result);
    }

    @Test
    public void testCheckNameWhenUsernameIs45() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Username is too long!");

        user.checkName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

}
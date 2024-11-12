package handleTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import twitter_handle.EmptyHandleException;
import twitter_handle.Twitter_Handle;

public class checkIfTests {

    @Test
    void checkHandleLessThan9CharactersTest() throws EmptyHandleException {
        String actual = Twitter_Handle.createHandle("iamtoolong");
        String expected = Twitter_Handle.createHandle("ninecharacters");

        Assertions.assertEquals(expected.length(), actual.length());


    }

    @Test
    void checkEmptyOrBlankCharactersTest() throws EmptyHandleException {
        //String newHandle = Twitter_Handle.createHandle(" ");

        Assertions.assertThrows(EmptyHandleException.class, () -> { Twitter_Handle.createHandle(" ");});
    }

}

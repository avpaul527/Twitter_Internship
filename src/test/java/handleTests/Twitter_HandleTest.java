package handleTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import twitter_handle.DuplicateHandleException;
import twitter_handle.EmptyHandleException;
import twitter_handle.Twitter_Handle;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class Twitter_HandleTest {

    @Test
    void createHandle() throws EmptyHandleException {
        String actual = Twitter_Handle.createHandle("avpaul27");



        String expected = "@avpaul27";

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void addHandle() throws EmptyHandleException, DuplicateHandleException {
        String newHandle = "avpaul27";

        Twitter_Handle.addHandle(newHandle);

        HashSet<String> expected = new HashSet<>();
        expected.add("@avpaul27");

        Assertions.assertEquals(expected, Twitter_Handle.getHandles());

    }

    @Test
    void removeHandle() throws EmptyHandleException, DuplicateHandleException {

        Twitter_Handle.addHandle("alex5");
        Twitter_Handle.addHandle("paul27");

        Twitter_Handle.removeHandle("paul27");


        HashSet<String> expected = new HashSet<>();
        expected.add("@alex5");

        Assertions.assertEquals(expected, Twitter_Handle.getHandles());

    }
}
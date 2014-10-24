import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ce416-081 on 2014. 10. 24..
 */
public class Calculator {


    @Test
    public void testName() throws Exception {
            assertThat(3-1, is(2));
    }


}
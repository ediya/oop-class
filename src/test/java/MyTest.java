import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ce416-081 on 2014. 10. 24..
 */
public class MyTest {

    public static void main(String[] args){

        Assert.assertThat(1+2, is(3));
    }
}

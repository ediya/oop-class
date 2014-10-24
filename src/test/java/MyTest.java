import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ce416-081 on 2014. 10. 24..
 */
public class MyTest {

    public static void main(String[] args){

        int result = new Calculator().getSum(1,2);

        Assert.assertThat(1+2, is(3));
    }

}

class Calculator {

    public int getSum(int n1, int n2){
        return n1 + n2;
    }
}
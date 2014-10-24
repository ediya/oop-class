import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ce416-081 on 2014. 10. 24..
 */
public class Calculator {
    public int getSum(int n1, int n2){
        assertThat(3, is(3));
        return n1 + n2;
    }

    public int getSum1To10(){
        int result = 0;
        int expected = 55;
        for(int i=1; i<=10; i++){
            result += i;
        }
        assertThat(result, is(expected));
        return result;
    }
}

/**
 * Created by ce416-081 on 2014. 10. 24..
 */
public class MyTest {

    public static void main(String[] args){

        Calculator calc = new Calculator();

        int sum = calc.getSum(1, 2);
        System.out.println("1 + 2 = " + sum);

        int sum1to2 = calc.getSum1To10();
        System.out.println("1 + 2 + ... + 10 = " + sum1to2);
    }
}
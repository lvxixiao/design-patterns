package test;

import main.strategy.Context;
import main.strategy.OperationAdd;
import main.strategy.OperationMultiply;
import main.strategy.OperationSubstract;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/1/9 22:41
 * Modified By :
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

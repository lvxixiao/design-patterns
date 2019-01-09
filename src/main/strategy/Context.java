package main.strategy;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/1/9 22:39
 * Modified By :
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

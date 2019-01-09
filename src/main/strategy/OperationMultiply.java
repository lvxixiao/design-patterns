package main.strategy;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/1/9 22:38
 * Modified By :
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

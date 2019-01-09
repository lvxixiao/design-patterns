package main.strategy;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/1/9 22:37
 * Modified By :
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

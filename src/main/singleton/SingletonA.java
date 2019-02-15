package main.singleton;

/**
 * Author : axiao
 * Description : 急切加载形式.
 * User : axiao
 * Date : Created in 2019/2/15 20:00
 * Modified By :
 */
public class SingletonA {
    private static final SingletonA instance = new SingletonA();

    private SingletonA(){}

    public static SingletonA getInstance() {
        return instance;
    }
}

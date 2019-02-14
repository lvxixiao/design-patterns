package main.factory.simple.produce;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/14 15:23
 * Modified By :
 */
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare!");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake!");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut!");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box!");
    }
}

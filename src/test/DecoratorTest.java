package test;

import main.decorator.Beverage;
import main.decorator.Impl.HouseBlend;
import main.decorator.Impl.Milk;
import main.decorator.Impl.Mocha;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/9 14:49
 * Modified By :
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());

        Beverage beverage1 = new Mocha(beverage);
        System.out.println(beverage1.cost());

        Beverage beverage2 = new Milk(beverage);
        System.out.println(beverage2.cost());
    }
}

package main.decorator.Impl;

import main.decorator.Beverage;
import main.decorator.CondimentDecorator;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/9 14:46
 * Modified By :
 */
public class Milk implements CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 4;
    }
}

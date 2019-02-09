package main.decorator.Impl;

import main.decorator.Beverage;
import main.decorator.CondimentDecorator;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/9 14:44
 * Modified By :
 */
public class Mocha implements CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }
}

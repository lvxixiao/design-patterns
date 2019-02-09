package main.decorator.Impl;

import main.decorator.Beverage;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/9 14:43
 * Modified By :
 */
public class HouseBlend implements Beverage {
    @Override
    public double cost() {
        return 20;
    }
}

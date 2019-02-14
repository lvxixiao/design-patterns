package main.factory.simple;

import main.factory.simple.produce.CheesePizza;
import main.factory.simple.produce.Pizza;
import main.factory.simple.produce.VeggiePizza;

/**
 * Author : axiao
 * Description : 简单工厂
 * User : axiao
 * Date : Created in 2019/2/14 15:21
 * Modified By :
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

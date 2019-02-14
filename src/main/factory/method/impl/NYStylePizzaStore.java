package main.factory.method.impl;

import main.factory.method.PizzaStore;
import main.factory.simple.produce.CheesePizza;
import main.factory.simple.produce.Pizza;
import main.factory.simple.produce.VeggiePizza;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/14 15:44
 * Modified By :
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
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

package main.factory.method;

import main.factory.simple.produce.Pizza;

/**
 * Author : axiao
 * Description : 工厂方法
 * User : axiao
 * Date : Created in 2019/2/14 15:40
 * Modified By :
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public abstract Pizza createPizza(String type);
}

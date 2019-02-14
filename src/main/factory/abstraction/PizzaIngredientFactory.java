package main.factory.abstraction;

/**
 * Author : axiao
 * Description : 抽象工厂
 * User : axiao
 * Date : Created in 2019/2/14 15:55
 * Modified By :
 */
public interface PizzaIngredientFactory {

    String createCheese();
    String[] createVeggies();
}

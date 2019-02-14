package main.factory.abstraction;

/**
 * Author : axiao
 * Description :
 * User : axiao
 * Date : Created in 2019/2/14 15:57
 * Modified By :
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}

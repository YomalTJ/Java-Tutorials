package pizzabillgenerator;

public class PizzaBillGenerator {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(false);
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.takeAway();
        dp.getBill();
    }   
}
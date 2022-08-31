import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.red);
        Apple greenApple = new Apple(8, 60, Colour.green);
        Food[] goods = new Food[]{meat, redApple, greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(goods);
        System.out.println(shoppingCart.getPriseWithoutDiscount());
        System.out.println(shoppingCart.getPriseWithDiscount());
        System.out.println(shoppingCart.getVegetarianPriseWithoutDiscount());
    }
}
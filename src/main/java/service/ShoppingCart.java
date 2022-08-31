package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public int getPriseWithoutDiscount() {
        int prise = 0;
        for (Food food :
                foods) {
            prise += food.getAmount() * food.getPrice();

        }
        return prise;
    }

    public double getPriseWithDiscount() {
        double prise = 0;
        double discount;
        for (Food food :
                foods) {
            discount = food.getDiscount();
            if (discount > 0)
                prise += food.getAmount() * (food.getPrice() * discount / 100);
            else
                prise += food.getAmount() * food.getPrice();
        }
        return prise;
    }

    public int getVegetarianPriseWithoutDiscount() {
        int prise = 0;
        for (Food food :
                foods) {
            if (food.isVegetarian())
                prise += food.getAmount() * food.getPrice();
        }
        return prise;
    }
}

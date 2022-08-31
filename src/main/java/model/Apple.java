package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public Double getDiscount() {
        if (colour.equals(Colour.red)) {
            return Discount.discountForRedApple;
        }
        return 0.0;
    }
}
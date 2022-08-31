package model;

public abstract class Food implements Discountable {
    protected int amount;

    protected int price;

    protected boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

}

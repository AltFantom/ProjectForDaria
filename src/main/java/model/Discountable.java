package model;

interface Discountable {
    default Double getDiscount() {
        return 0.0;
    }
}

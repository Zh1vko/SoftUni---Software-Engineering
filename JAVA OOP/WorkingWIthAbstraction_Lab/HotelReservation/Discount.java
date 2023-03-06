package HotelReservation;

public enum Discount {
    VIP(0.8), SecondVisit(0.9), None(1);

    private double discountValue;

    Discount(double discountValue) {
        this.discountValue = discountValue;
    }

    public double getDiscountValue() {
        return discountValue;
    }
}

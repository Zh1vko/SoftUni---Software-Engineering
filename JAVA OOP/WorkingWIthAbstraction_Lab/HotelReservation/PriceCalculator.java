package HotelReservation;

public class PriceCalculator {

       private double pricePerDay;
       private int days;
       private Season seasonMultiplier;
       private Discount discountType;

    public PriceCalculator(double pricePerDay, int days, String season, String discountType) {      // TODO: use valueOf() for enum classes to get specific data.
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.seasonMultiplier = Season.valueOf(season);
        this.discountType = Discount.valueOf(discountType);
    }

    public double returnValue () {
        return pricePerDay * days * seasonMultiplier.getValue() * discountType.getDiscountValue();
    }
}

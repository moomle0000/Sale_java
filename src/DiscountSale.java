public class DiscountSale extends Sale {
    private double discount;

    public DiscountSale(String item, double price, double discount) {
        super(item, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "DiscountSale{" +
                "item='" + getItem() + '\'' +
                ", price=" + getPrice() +
                ", discount=" + discount +
                '}';
    }

    @Override
    public double bill() {
        return (1 - (discount / 100)) * getPrice();
    }
}
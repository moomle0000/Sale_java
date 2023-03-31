import java.util.ArrayList;

public class Main {
    public static double totalBill(ArrayList<Sale> sales) {
        double total = 0.0;
        for (Sale sale : sales) {
            total += sale.bill();
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<>();
        sales.add(new Sale("Atomic coffee mug", 111.00));
        sales.add(new Sale("Cup holder", 11.90));
        sales.add(new DiscountSale("Floor mat", 10.90, 10));
        sales.add(new DiscountSale("Map", 7.95, 0));

        for (Sale sale : sales) {
            System.out.println(sale);
        }

        System.out.println("Total bill: " + totalBill(sales));
    }
}

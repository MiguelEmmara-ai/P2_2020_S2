package Week04.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Purchase {
    private String purchaseItem;
    private double price;

    public Purchase(String purchaseItem, double price) {
        this.purchaseItem = purchaseItem;
        this.price = price;
    }

    public String getPurchaseItem() {
        return purchaseItem;
    }

    public void setPurchaseItem(String purchaseItem) {
        this.purchaseItem = purchaseItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return (String.format("%-29s", getPurchaseItem()) + String.format("$%6.2f", this.getPrice()));
    }
}

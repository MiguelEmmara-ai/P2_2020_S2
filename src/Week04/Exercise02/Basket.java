package Week04.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class Basket {
    private Purchase[] purchases;
    private int nPurchase;
    private int purchaseCount = 0;

    public Basket(int n) {
        this.setnPurchase(n);
        this.setPurchases(this.purchases);
    }

    public Purchase[] getPurchases() {
        // Instance data
        int currentItems = 0;

        // For each to go through this.purchases array
        for (Purchase purchase : this.purchases) {
            // If statement to check if element in array is not a null.
            if (purchase != null) {
                currentItems++;
            }
        }

        // Create new array
        Purchase[] currentPurchases = new Purchase[currentItems];

        int index = 0;

        // For each to go through this.purchases array
        for (Purchase purchase : this.purchases) {
            // If statement to check if element in array is not a null.
            if (purchase != null) {
                currentPurchases[index++] = purchase;
            }
        }

        return currentPurchases;
    }

    public void setPurchases(Purchase[] purchases) {
        this.purchases = new Purchase[getnPurchase()];
    }

    public int getnPurchase() {
        return nPurchase;
    }

    public void setnPurchase(int nPurchase) {
        if (nPurchase > 0) {
            this.nPurchase = nPurchase;
        } else {
            this.nPurchase = 10;
        }
    }

    // Methods
    public void addPurchase(Purchase p) {
        // If
        if (this.nPurchase == this.purchaseCount) {
            System.out.println("Sorry, to many items in the basket!");
        } else {
            // For loop to go through this.purchases array
            for (int i = 0; i < this.purchases.length; i++) {
                if (this.purchases[i] == null) {
                    this.purchases[i] = p;
                    this.purchaseCount++;
                    break;
                }
            }
        }
    }

    public Purchase getMostExpensive() {
        // Instance data
        Purchase productPurchase = null;
        double maxPrice = Double.MIN_VALUE;

        // For each
        for (Purchase product : this.purchases) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                productPurchase = product;
            }
        }
        return productPurchase;
    }

    public double total() {
        // Instance data
        double totalPrice = 0;

        // For each to go through this.purchases array
        for (Purchase product : this.purchases) {
            // Add product.getProductPrice() to totalPrice
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printReceipt() {
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("%-22s %6s\n", "Product Name", "Product Price");

        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print Products
        for (Purchase product : this.purchases) {
            System.out.println(product);
        }

        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.printf("%29s$%s\n", "GRAND TOTAL: ", String.format("%6.2f", this.total()));

        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

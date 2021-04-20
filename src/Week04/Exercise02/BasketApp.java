package Week04.Exercise02;

/**
 * Created by Miguel Emmara
 */
public class BasketApp {
    public static void main(String[] args) {
        Basket cartShopping = new Basket(11);

        cartShopping.addPurchase(new Purchase("Chicken Breast", 11.00));
        cartShopping.addPurchase(new Purchase("Jasmine Rice", 3.00));
        cartShopping.addPurchase(new Purchase("Tuna Smoke Flavour", 3.60));
        cartShopping.addPurchase(new Purchase("Mi Goreng", 5.00));
        cartShopping.addPurchase(new Purchase("Broccoli", 3.49));
        cartShopping.addPurchase(new Purchase("Frozen Vegetables", 3.49));
        cartShopping.addPurchase(new Purchase("Apple 1 Bag", 5.99));
        cartShopping.addPurchase(new Purchase("Bread", 2.49));
        cartShopping.addPurchase(new Purchase("Canola Oil", 1.49));
        cartShopping.addPurchase(new Purchase("Toilet Paper", 4.99));
        cartShopping.addPurchase(new Purchase("Peanut Butter", 6.99));

        cartShopping.printReceipt();

        System.out.println("Most Expensive:\n" + cartShopping.getMostExpensive());
    }
}

import java.util.ArrayList;

class CartItem {
  
    String itemName;
    double price;
    int quantity;


    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    double getTotalPrice() {
        return price * quantity;
    }

  
    void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalPrice());
    }
}

class ShoppingCart {
    
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println(cart.get(i).itemName + " removed from cart.");
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

  
    void displayTotalCost() {
        double total = 0;
        System.out.println("\nItems in Cart:");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: " + total);
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

      
        myCart.addItem(new CartItem("Laptop", 55000, 1));
        myCart.addItem(new CartItem("Headphones", 2000, 2));
        myCart.addItem(new CartItem("Mouse", 700, 1));


        myCart.displayTotalCost();


        myCart.removeItem("Headphones");

      
        myCart.displayTotalCost();
    }
}

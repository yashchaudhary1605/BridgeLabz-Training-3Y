class Item {
   
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }


    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
   
        Item i1 = new Item(101, "Laptop", 55000.75);

 
        i1.displayItem();

        int quantity = 3;
        double total = i1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

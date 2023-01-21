package Strategy;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy {
    public void pay(int amount);
}

class KakaCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KakaCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid using KakaCard");
    }
}

class LunaStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public LunaStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +  " paid using LunaCard");
    }
}

class Item {
    private String name;
    private int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class ShoppingCart {
    List<Item> items;


    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for(Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item a = new Item("A", 100);
        Item b = new Item("B", 300);

        cart.addItem(a);
        cart.addItem(b);

        cart.pay(new LunaStrategy("A@example.com", "1234"));
        cart.pay(new KakaCardStrategy("John","123456789", "123", "12/01"));
    }
}

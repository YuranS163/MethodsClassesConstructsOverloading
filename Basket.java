public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;
    public Basket() {
        items = "?????? ???????:";
        limit = 1000000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public void add(String name, int price, int count, double weight) {
        add(name, price, 1);
        totalWeight = totalWeight + weight;
    }
    public void add(String name, int price) {
        add(name, price, 1);
    }
    public void add(String name, int price, int count) {
        if (contains(name)){
            return;
        }
        if (totalPrice + count * price >= limit) {
            return;
        }
        if (items == "") {
            items = items + name + " - " + count + " ??. ?? " + price + " ???. ";
        } else items = items + "\n" + name + " - " + count + " ??. ?? " + price + " ???. ";
        totalPrice = totalPrice + count * price;

    }
    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }
    public double getTotalWeight() {
        return totalWeight;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public boolean contains(String name) {
        return (items.contains(name));
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("??????? ?????");
        } else {
            System.out.println(items + "\n?????: " + getTotalPrice() + " ???. " + getTotalWeight() + " ??.");
        }
    }
}

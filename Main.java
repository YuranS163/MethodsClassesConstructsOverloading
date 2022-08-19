public class Main {
    public static void main(String[] args) {
        Basket basketKate = new Basket();
        basketKate.add("Губка", 200);
        basketKate.add("Водяра", 200, 3);
        basketKate.add("Гудрон", 100, 0, 2.5);
        basketKate.add("Снэки", 50, 0, 3);
        basketKate.print("Корзина Катьки: ");
    }
}

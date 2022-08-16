public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);
        Basket petyaBasket = new Basket(10000);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);
        Basket katyaBasket = new Basket(390);
        Basket mashaBasket = new Basket("Стол", 399);

        vasyaBasket.print("*Корзина Васи*");
        petyaBasket.print("\n*Корзина Пети*");
        katyaBasket.print("\n*Корзина Кати*");
        mashaBasket.print("\n*Корзина Маши*");
    }
}

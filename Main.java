public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("������", 80);
        vasyaBasket.add("����", 40);
        Basket petyaBasket = new Basket(10000);
        petyaBasket.add("������", 280);
        petyaBasket.add("�����", 2900);
        Basket katyaBasket = new Basket(390);
        Basket mashaBasket = new Basket("����", 399);

        vasyaBasket.print("*������� ����*");
        petyaBasket.print("\n*������� ����*");
        katyaBasket.print("\n*������� ����*");
        mashaBasket.print("\n*������� ����*");
    }
}

public class Main {
    public static void main(String[] args) {
        Basket basketKate = new Basket();
        basketKate.add("�����", 200);
        basketKate.add("������", 200, 3);
        basketKate.add("������", 100, 0, 2.5);
        basketKate.add("�����", 50, 0, 3);
        basketKate.print("������� ������: ");
    }
}

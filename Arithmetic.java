public class Arithmetic {
    private final int a;
    private final int b;
    private int sravnitel = 0;
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void addition() {
        System.out.println("����� ����� = " + (a + b));
    }
    public void multiplication() {
        System.out.println("������������ ����� = " + (a * b));
    }
    public void bolshe() {
        if (a > b) {
            sravnitel = a;
        } else if (b > a){
            sravnitel =  b;
        } else {
            System.out.println("����� �����");
            return;
        }
        System.out.println("������ ����� " + sravnitel);
    }
    public void menshe() {
        if (a < b) {
            sravnitel = a;
        } else if (b < a){
            sravnitel =  b;
        } else {
            System.out.println("����� �����");
            return;
        }
        System.out.println("������ ����� " + sravnitel);
    }
}

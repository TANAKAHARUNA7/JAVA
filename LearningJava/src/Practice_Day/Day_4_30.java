package Practice_Day;
interface KL { public abstract void print(); }

class T {
    KL obj;  // 🔧 正しく obj に修正
    T(KL obj) {
        this.obj = obj;
    }
    void prt() { obj.print(); }
}

class P implements KL { public void print(){ System.out.println("P"); } }
class Q implements KL { public void print(){ System.out.println("Q"); } }
class Z implements KL { public void print(){ System.out.println("Z"); } }

public class Day_4_30 {
    public static void main(String[] args) {
        (new T(new P())).prt();
        (new T(new Q())).prt();
        (new T(new Z())).prt();
    }
}
package Practice_Day;

class A1 {
    A1() {
        System.out.println("Aコンストラクタ");
    }
}

class B1 extends A1 {
    B1(int a) {
        System.out.println("Bコンストラクタ: " + a);
    }
}
class C1 extends B1 {
    C1() {
        super(3);

        System.out.println("Cコンストラクタ: " );
    }
}

class D1 extends C1 {

}

public class Dar_4_7 {
    public static void main(String[] args) {
        System.out.println("=== A 생성 ===");
        A1 a = new A1();
        System.out.println("\n=== B 생성 ===");
        B1 b = new B1(3);
        System.out.println("\n===C 생성 ===");
        C1 c = new C1();

    }
}

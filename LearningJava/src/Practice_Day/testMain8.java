package Practice_Day;
class A {
    int a = 1;

    A() {
        System.out.println("A 생성자 호출");
    }

    void prt() {
        System.out.println(a);
    }
}

class B extends A {
    int a = 2;

    B() {
        System.out.println("B 생성자 호출");
    }

    void prt() {
        System.out.println(a);
    }
}

class C extends B {
    int a = 3;

    C() {
        super();
        System.out.println("C 생성자 호출");
    }

    void prt() {
        System.out.println(a);
    }
}
public class testMain8 {
    public static void main(String[] args) {
        System.out.println("=== A 생성 ===");
        A a = new A();

        System.out.println("\n=== B 생성 ===");
        B b = new B();

        System.out.println("\n=== C 생성 ===");
        C c = new C();
    }
}

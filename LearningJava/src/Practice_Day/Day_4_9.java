package Practice_Day;

class D {
    int a = 1;
    void prt() {
        System.out.println(a);
    }
}

class E extends D {
    int a = 2;
    void prt() {
        System.out.println(a);
    }
}

class F extends E {
    int a = 3;
    void prt() {
        System.out.println(a);
    }
}

public class Day_4_9 {
    public static void main(String[] args) {
        new D().prt();
        new E().prt(); // そのオブジェクトを指す参照変数がないため実行後はGC対象になりいつか消える

        F bar = new F();
        System.out.println((bar.a));
        System.out.println(((E) bar).a);
        System.out.println(((D) bar).a);
    }
}

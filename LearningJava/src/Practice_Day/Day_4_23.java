package Practice_Day;

class Pos {
    final int x = 2; // x は定数（変更不可）
    // final変数は一度決めたら変更できない

    void prt(){
        System.out.println(x);
    }
}
class Foo extends Pos { // finalがついてるクラスは継承できない
    void print(){}
    @Override
    void prt(){
        super.prt();
    }
}
public class Day_4_23 {
    public static void main(String[] args) {
        Pos f = new Foo();
        f.prt();

    }
}

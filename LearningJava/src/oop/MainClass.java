package oop;

class Bar2{
    String msg;
    // インスタンス初期化ブロック　:　オブジェクトが生成されるときに初期化作業を実行
    // コンストラクタより先に実行される

    //　クラス初期化ブロック　:　クラスがJVMにローディングされるとき実行される
   static{
        System.out.println("ミンソクは今日は残って勉強します");
    }

    Bar2(String argMsg){
        msg = argMsg;
        System.out.println(msg);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Bar2 br1 = new Bar2("Hello");
        Bar2 br2 = new Bar2("World");
    }
}

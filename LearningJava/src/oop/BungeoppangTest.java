package oop;
class Bungeoppang {

    String filling;
    // デフォルトコンストラクタ
    Bungeoppang(){
        this.filling = "あんこ";
    }

    // パラメーターコンストラクタ
    Bungeoppang(String filling){
        this.filling = filling;
    }
    void printInfo(){
        System.out.println("このたい焼きのあんは" + filling + "です。");
    }
}
public class BungeoppangTest {
    public static void main(String[] args) {
        // デフォルトコンストラクタでインスタンスを作成
        Bungeoppang redBean = new Bungeoppang();
        redBean.filling = "밭"; // フィールドに直接地を設定

        // パラメーターコンストラクタ
        Bungeoppang cream = new Bungeoppang("그림");

        redBean.printInfo(); // このたい焼きのあんはあんこです。
        cream.printInfo();   // このたい焼きのあんはシュークリームです

        int i ;
        i = 0;

        int j = 0;

    }
}

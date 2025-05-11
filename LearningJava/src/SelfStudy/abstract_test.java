package SelfStudy;
// 共通のクラブ設計図
abstract class Club {
    String name; // クラブ名

    // クラブ名初期化
    Club(String name) {
        this.name = name;
    }

    // クラブ名出力
    public void display() {
        System.out.println("クラブ名: " + name);
    }

    // 抽象class練習メニュー
    public abstract void practice();
}

// 陸上部
class TandF extends Club{
    TandF(String name){
        super(name);
    }
    @Override
    public void practice(){
        System.out.println("=== 練習メニュー ===");
        System.out.println("ランニング");
        System.out.println("ショートラン");
        System.out.println("ストレッチ");
    }
}
// サッカー部
class Football extends Club{
    Football(String name){
        super(name);
    }
    @Override
    public void practice(){
        System.out.println("=== 練習メニュー ===");
        System.out.println("シュート練習");
        System.out.println("ドリブル練習");
        System.out.println("パス練習");
    }
}
// バスケ部
class Basketball extends Club{
    Basketball(String name){
        super(name);
    }
    @Override
    public void practice(){
        System.out.println("=== 練習メニュー ===");
        System.out.println("ブザービート練習");
        System.out.println("パス練習");
        System.out.println("ダッシュ");
    }
}

// clubの情報を扱う生徒class
class Student6{
    String name; // 生徒名
    Club club; //抽象クラス型でポリモーフィズムを実現。

    // 生徒名とクラブのオブジェクトを初期化
    Student6(String name , Club club){
        this.name = name;
        this.club = club;
    }

    // 名前と所属クラブ名出力
    public void display(){
        System.out.println("名前: " + name);
        club.display();
    }

    public void practice(){
        club.practice();
    }
}

public class abstract_test {
    public static void main(String[] args) {
    TandF tandf = new TandF("陸上部");
    Student6 stu1 = new Student6("田中", tandf);
    stu1.display();
    stu1.practice();
    System.out.println();

    Football fot = new Football("サッカー部");
    Student6 stu2 = new Student6("鈴木", fot);
    stu2.display();
    stu2.practice();
    System.out.println();

    Basketball bsk = new Basketball("バスケ部");
    Student6 stu3 = new Student6("佐藤", bsk);
    stu3.display();
    stu3.practice();

    }
}

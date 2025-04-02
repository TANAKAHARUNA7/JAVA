package oop;

// Inheritance(相続)
// 親クラスからメンバー達（メンバー変数、メンバーメソッド）を受ける
// 多重相続 -> 親クラスが2つ以上
// 単一相続 -> 親クラスが必ず１つ　※JAVAは単一相続！
class Students{
    int id = 2;
    String name = "Student";
    int age= 30;
}

class GscStudent extends Students{
    int id = 20;
    String name = "GSC";
    GscStudent(){
        System.out.println("id: " + this.id + ",name: " + super.name + ",age: " + age );
    }
}


public class MainTest6 {
    public static void main(String[] args) {
        GscStudent s = new GscStudent();
        s.id = 1;
        s.name = "haruna";
    }
}

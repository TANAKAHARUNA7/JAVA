package oop;

class Student{
    // メンバ変数（属性）
    String name;   // 学生の名前
    int engScore;  // 英語の点数
    int mathScore; // 数学の点数

    // メソッド（操作）
    // 名前とスコアを表示する
    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }

    void setScore(int eng, int math){
        engScore = eng;
        mathScore = math;
    }
    double getAvg(){
        double avg = (engScore + mathScore) / 2.0;
        return avg;
    }
}

public class StuSample {
    public static void main(String[] args) {
        // Studentクラスのオブジェクトstu1を作成
        Student stu1 = new Student();

        // stu1 の name に "菅原" を代入。
        stu1.name = "菅原";
        // setScore(90, 80) を呼び出し、英語90点・数学80点を設定。
        stu1.setScore(90, 80);

        stu1.display();
        System.out.println("平均" + stu1.getAvg() + "点");
}
}

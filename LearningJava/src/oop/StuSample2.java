package oop;

class Student2{
    String name;
    int engScore;
    int mathScore;

    void setData(String n){
        name = n;
    }

    void setData(String n, int avgEngScore, int avgMathScore){
        name = n;
        engScore = avgEngScore;
        mathScore = avgMathScore;
    }

    void setScore(int avgEngScore, int avgMathScore){
        engScore = avgEngScore;
        mathScore = avgMathScore;
    }

    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
    }

}
public class StuSample2 {
    public static void main(String[] args) {
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setData("菅原");
        stu1.setScore(90, 70);
        stu1.display();

        stu2.setData("村山", 80, 60);
        stu2.display();

    }
}

package oop;

class Student3{
    String name;
    int engScore;
    int mathScore;

    Student3(String argName){
        name= argName;
    }

    Student3(String argName, int argEngScore, int argMathScore){
        name = argName;
        engScore = argEngScore;
        mathScore = argMathScore;
    }

    void setScore(int argEngScore, int argMathScore){
        engScore = argEngScore;
        mathScore = argMathScore;
    }

    void display(){
        System.out.println(name + "さん");
        System.out.println("英語" + engScore + "点" + "数学" + mathScore + "点");
    }
}


public class Constructor {
    public static void main(String[] args) {
        Student3 stu1 = new Student3("田中");
        Student3 stu2 = new Student3("山田", 80, 90);

        stu1.setScore(80,60);
        stu1.display();
        stu2.display();
    }
}

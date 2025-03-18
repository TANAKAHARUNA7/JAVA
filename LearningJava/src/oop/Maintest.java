package oop;

class Std{

    int korean;
    int math;
    int english;
    int sum;
    final int NUM_OF_SUBJECT = 3;

    int id;
    String name;

    void setGrade(int argKorean, int argMath, int argEnglish){
        korean = argKorean;
        math = argMath;
        english = argEnglish;
        sum = korean + math + english;
    }

    void prtStu(){
     System.out.println("国語" + korean + "点," + "数学" + math + "点,"
             + "英語" + english + "点," + "合計" + sum + "点");
    }

    double getSum(){
        return sum;
    }
    int getid(){
        return id;
    }

    String getName(){
        return name;
    }

    double getAvg(){
        return sum / NUM_OF_SUBJECT;
    }
}

class Car1{
    String brand;

    void prtCar() {
        System.out.println("brand: " + brand);
    }
}

class Bar{
    String name;
    int age;

    // 製造者 -> クラスの名前と同一でなければならない
    Bar(String argName, int argAge) {
        name = argName;
        age = argAge;
//        System.out.println("Bar 製造者放出");
    }

    void prtBar(){
        System.out.println(name + "\t" + age + "才");
    }
}


public class Maintest {
    public static void main(String[] args) {
        Std stu1 = new Std();
        stu1.name = "John";
        stu1.setGrade(80, 90, 70);
        stu1.prtStu();

        Car1 car1 = new Car1();
        car1.brand = "SUZUKI";
        car1.prtCar();

        Bar b1 = new Bar("Richard", 25);
        b1.prtBar();

    }
}

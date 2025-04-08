package SelfStudy;

class Person{
    private String name;
    public void setName (String n){
        name = n;
    }
    public void display(){
        System.out.println("name: " + name);
    }
}

class Student extends Person{
    private int stuNo;
    public void setStuNo(int s){
        stuNo = s;
    }
    public void displayStuNo(){
        System.out.println("学番: " + stuNo);
    }
}

public class oopTest3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        // スーパークラスのメソッド
        stu1.setName("田中");
        stu1.display();

        // サブクラスのメソッド
        stu1.setStuNo(24);
        stu1.displayStuNo();
    }
}

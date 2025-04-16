package SelfStudy;

class Person2{
    private String name;
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void display(){
        System.out.println("name: " + name);
    }
}

class Student2 extends Person2{
    private int stuNo;
    void setStuNo(int s){
        stuNo = s;
    }
    void display(){
        System.out.println("name: " + getName());
        System.out.println("学番: " + stuNo);
    }
}

public class oopOverrride {
    public static void main(String[] args) {
        Student2 stu1 = new Student2();

        stu1.setName("TANAKA");
        stu1.setStuNo(1);
        stu1.display();
    }
}

package SelfStudy;

class Person2{
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("name: " + name);
    }
}

class Student2 extends Person2{
    private int stuNo;
    public void setStuNo(int s){
        stuNo = s;
    }
    public void display(){
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

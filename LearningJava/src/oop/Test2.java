package oop;

class Student25 {
    String name;
    int age;

    Student25(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void prt(){
        System.out.println(name + " " + age);
    }
}


public class Test2 {
    public static void main(String[] args) {
        Student25 st1 = new Student25("하루나",30);
        st1.prt();
    }
}

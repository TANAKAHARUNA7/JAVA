package SelfStudy;
// Animal class
class Animal{
    protected String name;
    protected int age;
    { System.out.println("동물이 만들어 줬습니다."); }

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void profile(){}
    void speak(){ }
    void eat(){}
}
// Dog class
class Dog extends Animal{
    String kinds;
    Dog(String name, int age, String kinds){
        super(name, age);
        this.kinds = kinds;
    }
    Dog(String name, int age){
        super(name, age);
    }

    void speak(){ System.out.print("わんわん！"); }
    void eat(){ System.out.print("ドッグフードを食べます"); }
    void profile(){
        System.out.println("名前:" + name );
    }
}
// Cat class
class Cat extends Animal{
    String color;

    Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    void speak(){ System.out.print("にゃー！"); }
    void eat(){ System.out.print("魚を食べます"); }
}


public class Oop_Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("モカ", 16);
        Animal cat = new Cat("シロ", 10, "白");


    }
}

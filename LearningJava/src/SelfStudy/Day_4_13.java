package SelfStudy;

class Dog{
    private String name;
    private int age;

    {System.out.println("Dog instance");}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(int age ){
        this("A dog", age);
    }

    public Dog(){
        this("A dog", 0);
    }

    public String profile(){
        return name + "("+age+")";
    }

}

public class Day_4_13 {
    public static void main(String[] args) {
    Dog black = new Dog(2);
    System.out.println(black.profile());
    System.out.println("");

    Dog white = new Dog();
    System.out.println(white.profile());
    }
}

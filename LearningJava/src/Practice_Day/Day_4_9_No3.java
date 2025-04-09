package Practice_Day;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println(this.name + "が動物園に入場します！");
    }
}

class Dog extends Animal {
    String breed;
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("品種: " + breed + "犬です");
    }
}

class Cat extends Animal{
    String color;
    Cat(String name,String color){
        super(name);
        this.color = color;
        System.out.println("色: " + color + "猫です！");
    }
}

public class Day_4_9_No3 {
    public static void main(String[] args) {
        Dog dog = new Dog("モか", "ミニチュアダックス");
        System.out.println("==================");
        Cat cat = new Cat("タマ", "白");
    }
}

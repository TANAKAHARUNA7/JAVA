package oop;

class Animal {
    void makeSound() {
        System.out.println("動物の鳴き声");
    }
}

class Dog extends Animal{
        void makeSound(){
            System.out.println("わんわん");
        }
}
class Cat extends Animal{
        void makeSound(){
            System.out.println("にゃんにゃん");
        }
}

public class Test {
    public static void main(String[] args) {
        Animal sound = new Animal();
        sound.makeSound();

        Animal myPet = new Dog();
        myPet.makeSound();

        myPet = new Cat();
        myPet.makeSound();

    }
}

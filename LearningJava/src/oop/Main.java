package oop;

class Car3 {
    static int totalCars = 0;
    String model;

    Car3(String model) {
        this.model = model;
        Car3.totalCars++;
    }

    void showModel(){
        System.out.println("Model" + model);
    }

    static void showTotalCars(){
        System.out.println("Total Cars: " + Car3.totalCars);
    }
}

public class Main {
    public static void main(String[] args) {
        Car3.showTotalCars();  // クラスメソッドの呼び出し（オブジェクトなし）

        Car3 car1 = new Car3("BMW");
        Car3 car2 = new Car3("Tesla");

        car1.showModel();  // インスタンスメソッド（オブジェクトを通じて呼び出し）
        car2.showModel();

        Car3.showTotalCars(); // クラスメソッドの再呼び出し（オブジェクトなし）





    }
}

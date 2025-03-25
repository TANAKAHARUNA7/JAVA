package oop;
    class Car2{
        static int totalCars;
        String model;


        {
        System.out.println("初期化ブロック");}

        Car2(String model){
            this.model = model;
            System.out.println("モデル生成！");
            totalCars++;
        }

        void showModel(){
            System.out.println("Model: " + model);
        }

        static void showTotalCars(){
            System.out.println("Total Cars: " + totalCars);
        }
    }

public class Maintest {
    public static void main(String[] args) {
        Car2.showTotalCars();

        Car2 car1 = new Car2("TOYOTA");

        Car2 car2 = new Car2("SUZUKI");

        car1.showModel();
        car2.showModel();

        Car2.showTotalCars();
    }
}

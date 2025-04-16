package oop;

class Car3{
    String maker;
    String model;
    int year;

    // 자동차 기본 정보 출력
    void prtInfo(){
        System.out.println("=== Car Info ===");
        System.out.println("Maker: " + maker );
        System.out.println(" Model: " + model );
        System.out.println(" Year: " + year);
    }
}

// 자식 클래스: SUV(Car 클래스를 상속받아 기능 확장)
class Suv extends Car3{
    boolean allWheelDrive;

    // 자동차 정보 출력 기능 재정의(Override)
    @Override
    void prtInfo(){
        super.prtInfo();
        System.out.println("4WD : " + allWheelDrive );
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car3 car = new Suv();
        car.prtInfo();

    }
}

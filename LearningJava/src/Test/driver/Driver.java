package Test.driver;

import Test.Company.SalesEmployee;

public class Driver {
    public static void main(String[] args) {
        SalesEmployee tanaka = new SalesEmployee("田中榛", 100000);
        System.out.println();
        tanaka.displayInfo();
        tanaka.displayCompany();
        tanaka.sell(400);
        System.out.println(tanaka.sell());

        SalesEmployee satou = new SalesEmployee("佐藤麻梨亜");
        System.out.println();
        satou.displayInfo();
    }
}

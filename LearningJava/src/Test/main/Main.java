package Test.main;
import Test.company.Manager;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("田中", 5000000, 1000000);
        m.printTotalCompensation();

        // 以下はコンパイルエラーになる（外部から protected メンバーにアクセス不可）
        // System.out.println(m.salary);
    }
}

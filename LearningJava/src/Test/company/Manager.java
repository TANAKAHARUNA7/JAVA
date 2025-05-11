package Test.company;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);  // protectedフィールドにアクセス可能
        this.bonus = bonus;
    }

    public void printTotalCompensation() {
        printSalary(); // protectedメソッドにアクセス可能
        System.out.println("ボーナスを含めた合計は " + (salary + bonus) + "円です。");
    }

}

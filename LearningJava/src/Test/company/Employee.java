package Test.company;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected void printSalary() {
        System.out.println(name + "の給料は " + salary + "円です。");
    }
}

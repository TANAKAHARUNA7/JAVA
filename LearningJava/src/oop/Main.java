package oop;

class Calculator{
    // 클래스 멤버 변수
    // 모든 인스턴스에서 공유 된다
    static int totalCalculations; // = 0;로 되지않아도 자동으로 초기값은 0

    double lastResult; // 인스턴스 멤버 변수

    // 인스턴스 메소드
    double add (double a, double b){
          lastResult = a + b;
          totalCalculations++;
          return lastResult;
    }

    // 인스턴스 메소드
    double multiply(double a, double b) {
          lastResult = a * b;
          totalCalculations++;
          return lastResult;
    }

    // 클래스 메소드 : 전체의 계산 횟수를 표시 (static이니까 )
    static void showTotalCalculations(){
          System.out.println("Total Calculations:: " + totalCalculations);
    }

    // 인스턴스 메소드
    void showLastResult(){
          System.out.println("Last Result:: " + lastResult);
    }
}

public class Main {
    public static void main(String[] args) {
        // まだ何も計算していないので0回
        Calculator.showTotalCalculations();

        // 1つ目のインスタンス作成
        Calculator calc1 = new Calculator();
        calc1.add(5, 6);
        calc1.multiply(7, 8);
        calc1.showLastResult();
        Calculator.showTotalCalculations();
        System.out.println(System.identityHashCode(calc1));
        System.out.println("\n");

        // 2つ目のインスタンス作成
        Calculator calc2 = new Calculator();
        calc2.add(3, 9);
        calc2.multiply(10, 2);
        calc2.showLastResult();
        Calculator.showTotalCalculations();
        System.out.println(System.identityHashCode(calc2));

    }
}

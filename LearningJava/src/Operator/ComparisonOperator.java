package Operator;

public class ComparisonOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // 同じ
        System.out.println("(a == b): " + (a == b));

        // 同じじゃない
        System.out.println("(a != b): " + (a != b));

        // 大きい
        System.out.println("(a > b): " + (a > b));

        //小さい
        System.out.println("(a < b): " + (a < b));

        //大きい又は同じ
        System.out.println("(a >= b): " + (a >= b));

        //小さい又は同じ
        System.out.println("(a <= b): " + (a <= b));


       if (a < b) {
           System.out.println("aはbより大きい");
       } else {
           System.out.println("aはbより大きい又は同じ");
       }




    }





}

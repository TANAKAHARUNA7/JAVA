package Operator;

public class ArithmeticOperetions1 {
    public static void main(String[] args) {
        // 1,基本　四則演算
        // a) +, -の場合陰数化,陽数化含む

        int a = 10;
        int b = -5;
        System.out.println("基本四則演算事例");
        System.out.println("a + b = " + (a + b)); // 10 + (-5) = 5
        System.out.println("a - b = " + (a - b)); // 10 - (-5) = 15
        System.out.println("a * b = " + (a * b)); // 10 * (-5) = -50
        System.out.println("a / b = " + (a / b)); // 10 / (-5) = -2


        // 陰数化、陽数化事例
        int positive = +a;
        int negative = -a;
        System.out.println("陽数化： ＋ " + a + " = " + positive);
        System.out.println("陰数化: -" + a + " = " +negative);

        System.out.println();

        //2.

    }




}

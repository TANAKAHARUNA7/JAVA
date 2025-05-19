package SelfStudy;

import java.util.Scanner;

public class Exception_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("1つめの整数を入力して下さい");
            String input1 = sc.nextLine();

            System.out.println("2つめの整数を入力して下さい");
            String input2 = sc.nextLine();

            int a = Integer.parseInt(input1);  // 数字に変換（失敗するとNumberFormatException）
            int b = Integer.parseInt(input2);

            int result = a / b;  // bが0の場合 ArithmeticException

            System.out.println("割り算の結果" + result);
        }catch (NumberFormatException e) {
            System.out.println("エラー:数字を入力してください");
        }catch (ArithmeticException e) {
            System.out.println("エラー:0で割ることはできません");
        }finally {
            System.out.println("プログラムを終了します");
            sc.close();
        }
    }
}

package VariableAndConstant1;// 入力を受けるモデュール
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

    // 入力をうける
    Scanner scanner = new Scanner(System.in);
    System.out.print("年齢を入力してください: ");
    int age = scanner.nextInt(); // 使用者が入力した値を保存

    System.out.print("身長を入力してください: ");
    float height = scanner.nextFloat();

    System.out.print("信用点数を入力してください: ");
    int K = scanner.nextInt();

    int total = age + (int) (height) + K;
    float avarage = (age + height + K) / 3;


    System.out.println("合計: " + total);
    System.out.printf("平均: %.2f%n" ,+ avarage);

    }

}

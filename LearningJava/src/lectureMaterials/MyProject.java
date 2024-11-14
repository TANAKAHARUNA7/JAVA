package lectureMaterials;

import java.util.Scanner;  //  Scannerクラスを使用するためのインポート宣言

public class MyProject {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in); // データを取得するためのコード
        //      ここの文字は任意

        System.out.print("最初の整数を入力してください");
        if (scanner.hasNextInt()){
            int firstNumber = scanner.nextInt();  //  入力を受けたデータを整数として読み取る

            System.out.print("二番目の整数を入力してください");
            if (scanner.hasNextInt()) {
                int secondNumber = scanner.nextInt();

                // 2つの数値を合計する
                int sum = firstNumber + secondNumber;
                System.out.println("合計: " + sum);
            }  else {
                System.out.println("2番目は整数ではありません");
            }
        } else {
            System.out.println("最初の入力が整数せはありません");
        }

        // スキャナを閉じる
        scanner.close();

    }
}


import java.util.Scanner;

public class CommentExample {

    public static void main(String[] args) {
        // Scanner 客体を生成して作用者入力を受ける
        Scanner scanner = new Scanner(System.in);

        // 使用者に出力する九九の入力を要請
        System.out.print("出力する九九を入力してください");
        int tableNumber = scanner.nextInt(); // 使用者が入力した値を保存


        /*
         * 入力された数字に九九を出力する反復文
         * 反復文は　１から９まで巡回しながら
         * 使用者が入力した数字とかけて結果を出力
         */
        for (int multiplier = 1; multiplier <= 9; multiplier++) {
            // 入力された数字につて1から9までかけて出力
            System.out.println(tableNumber + " * " + multiplier + " = " + tableNumber * multiplier);

        }

        // Scanner 次元解除
        scanner.close(); // リソースヌスを防止するためにScanner オブジェクト
    }
}

package special_class;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        // take1
        // キーボードから整数Nを入力受け
        // Nこのint型元素をもつ1次元の配列を生成せよ
        // もしN値が０～１０を超える場合再入力
        // take2
        //　生成された１次元配列にユーザから値の入力を受け、配列に順番に保存する
        // 例）　ユーザ１ → bar[0] = 1
        // もし陰数または０が入力された場合は再入力

        // 現在１次元の配列に入力された値を逆の順番で出力
        Scanner sc = new Scanner(System.in);
        int input = 0;

        // task1
        while (true){
            // 整数Nの入力を受ける
            System.out.print("1~10 사이의 정수를 입력하세요: " );
            input = sc.nextInt();
            // N値が０以下または１０を超える場合再入力
            if (input >= 0 && input <= 10){
                break;
            }
        }
        // N個のint型元素を持つ１次元の配列を生成
        int array [] = new int [input];


        // task2
        //　生成された１次元配列にユーザから値の入力を受け、配列に順番に保存する
        for (int index = 0 ; index < array.length ; index++){
            // もし陰数または０が入力された場合は再入力
            int value = 0;
            // 無限ループ
            while(true) {
                // 配列に入れる整数N個の入力を受ける
                System.out.printf((index+1) +"번째의 정수를 입력하세요( 0이상): ");
                value = sc.nextInt();
                // 入力を受けた整数の値が陽の整数だったら脱出
                if (value > 0) {
                    break;
                }
            }
            //　配列に順番に保存する
            array[index] = value;

        }
        // 配列に入力された値を逆の順番で出力
        for (int i = array.length -1 ; i >= 0 ; i--){
            System.out.println(array[i]);
        }
    }
}





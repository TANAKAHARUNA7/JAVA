package SelfStudy;

import java.util.Scanner;

public class functionEx {
    static Scanner sc = new Scanner(System.in);

    // 掛け算関数
    static void gugudan() {

        while (true) {

            System.out.print("出力したい掛け算の段を入力してください（1~9）");
            int input = sc.nextInt();

            if (input >= 1 && input <= 9) {
                for (int i = 1; i < 10; i++) {
                    System.out.println(input + " X " + i + " = " + input * i);
                }
                break;
            }
            System.out.println("1~9の数字を入力してください。");
        }
    }
    // a~z出力関数
    static void az() {
        for (char start = 'a'; start <= 'z'; start++) {
            System.out.print((start + ((start < 'z') ? "," : "")));
        }
        System.out.println();
    }

    // 🌟出力関数 (N X M)
    static void star() {

        System.out.print("N数を入力:　");
        int N = sc.nextInt();

        System.out.print("M数を入力:　");
        int M = sc.nextInt();

        // 出力の表示の仕方をランダムに
        int choice = (int) (Math.random() * 3);

        switch (choice) {
            //ex)
            // ***
            // ***
            // ***
            case 0:
                for (int row = 0; row < N; row++) {
                    for (int col = 0; col < M; col++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            //ex)
            //  * *
            // *  *
            // * *
            case 1:
                for (int row = 0; row < N; row++) {
                    for (int col = 0; col < M; col++) {
                        if (row == col) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            //ex)
            //  *
            // * *
            //  *
            case 2:
                for (int row = 0; row < N; row++) {
                    for (int col = 0; col < M; col++) {
                        if ((row == col) || (col + row == N - 1)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }

    public static void main(String[] args) {

        // userから整数の入力をうけてメニューを実施するプログラム


        while (true) {
            // userから整数の入力を受ける
            System.out.println("メニューを選択してください\n"
                    + "1. 掛け算出力\n"
                    + "2. a~z出力\n"
                    + "3. 🌟を出力\n"
                    + "4. プログラム終了\n"
            );
            int menu = sc.nextInt();

            // 4. プログラム終了
            if (menu == 4) {
                System.out.println("プログラムを終了します。");
                break;
            }

            switch (menu) {
                // 1: 掛け算出力
                case 1:
                    gugudan();
                    break;
                // 2: a~z出力
                case 2:
                    az();
                    break;
                // 3: 8 * 32の"*"を出力
                case 3:
                    star();
                    break;
            }
        }

    }
}

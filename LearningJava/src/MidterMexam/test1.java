package MidterMexam;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        // スロットゲーム作成
        Scanner sc = new Scanner(System.in);

        // 演算子の配列を作成する(*,+,-)
        char itemList [] = {'+','*','-'};

        final int NUM_OF_ITEM = 3;

        // スロット結果値を保存する配列
         char array [] = new char[NUM_OF_ITEM];

        // ゲームの回数をカウント
        int GameCount = 1;

        // スコア計算
        int Score = 0;


        // キーの入力を受けたらゲーム開始
        while (true) {

            //ゲーム終了条件
            // スコアが5点以上 -> "勝利"
            if (Score >= 5){
                System.out.println("勝利💑！ゲーム終了");
                break;
            }
            // スコアが‐5点以下　→　”敗北”
            if (Score <= -5) {
                System.out.println("敗北😢！ゲーム終了");
                break;
            }

            // ゲーム実行回数を出力
            System.out.println(GameCount + "回目ゲーム");

            // ゲーム開始の合図
            System.out.print("ゲームを始めるなら何かキーを押してください: ");
            String start = sc.nextLine();

            // itemListの中でランダムに3つシンボルを決定する
            for ( int i = 0 ; i < itemList.length ; i++ ) {
                int item = (int) (Math.random() * 3);
                // 1次元arrayの中に保存する

                array[i] = itemList[item];
            }

            // スロットの結果（arrayリスト）を出力
            System.out.println("==================================");
            for (char value :  array) {
                System.out.print("\t" + value + "\t:\t" );
            }
            System.out.println("\n==================================");

            // コンボ回数計算
            int ComboCount = 0;

            // 何のシンボルだったか保存
            char item = '\u0000';

            // シンボルが連続したらボーナスポイント発生
            for ( int i = 0 ; i < array.length -1 ; i++ ){
                if (array[i] == array[i+1] ){
                    ComboCount ++;
                    item = array[i];
                }
            }

            String msg = "";
            // 2個の場合
            if(ComboCount == 1) {
                switch (item){
                    // ++ -> +1
                    case '+':
                        Score ++;
                        msg = item + "2Combo - ボーナス点　1点獲得";
                        break;
                    // -- -> -1
                    case '-':
                        Score--;
                        msg = item + "2Combo - ボーナス点　1点減点";
                        break;
                    // ** -> +2
                    default:
                        Score += 2;
                        msg = item + "2Combo - ボーナス点　2点獲得";
            }
                System.out.println(msg);
            }
            // 3個の場合
            if (ComboCount == 2){
                switch (item){
                    // +++ -> +3
                    case '+':
                        Score += 3;
                        msg = item + "3Combo - ボーナス点　3点獲得";
                        break;
                    // --- -> -3
                    case '-':
                        Score -= 3;
                        msg = item + "3Combo - ボーナス点　3点減点";
                    break;
                    // *** -> +5
                    default:
                        Score += 5;
                        msg = item + "3Combo - ボーナス点　5点獲得";
            }
                System.out.println(msg);
            }

            // 毎ラウンド現在の獲得点数を表示する
            System.out.println("現在のスコア🌟: " + Score + "\n");
        }
    }
}

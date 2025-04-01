package oop;

import java.util.Scanner;

// 学生クラス（1人分の成績を管理）
class Std {
    // ID, 名前,　国語,　英語,　数学,　合計,　平均
    int id;
    String name;
    int scoreKorea;
    int scoreEnglish;
    int scoreMath;
    int sum;
    float avg;

    // コンストラクタ:IDと名前だけを初期化
    Std(int avgId, String argName) {
        name = argName;
        id = avgId;
    }

    // 科目の点数を設定する（範囲チェック付き）
    boolean setScore(int avgKorea, int avgEng, int avgMath) {
        // 0~100 の範囲でなければ false を返す
        if (avgMath < 0 || avgEng < 0 || avgKorea < 0) {
            return false;
        }
        if (avgMath > 100 || avgEng > 100 || avgKorea > 100) {
            return false;
        }

        // 有効な場合、点数を保存
        scoreKorea = avgKorea;
        scoreMath = avgMath;
        scoreEnglish = avgEng;
        return true;
    }

    // 各項目を呼び出すメソッド　必要時使用
    int getScoreMath() {
        return scoreMath;
    }

    int getScoreEnglish() {
        return scoreEnglish;
    }

    int getScoreKorea() {
        return scoreKorea;
    }

    // 合計を計算
    int getSum() {
        sum = scoreKorea + scoreEnglish + scoreMath;
        return sum;
    }

    // 平均を計算
    float getAvg() {
        avg = (float) getSum() / 3;
        return avg;
    }
}

// 学生の成績をまとめて管理するクラス
class StdScoreMgr {
    Std[] stdList;     // 学生の配列
    int numOfStudent;  // 学生数

    // コンストラクタ:配列の初期化
    StdScoreMgr(int argNumOfStudent) {
        stdList = new Std[argNumOfStudent];
        numOfStudent = argNumOfStudent;
    }

    // 学生情報を入力し配列に追加する
    void addStudent() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("id: ");
            int stdId = sc.nextInt();

            System.out.println("name: ");
            String stdName = sc.next();

            // Stdクラスのオブジェクトを生成
            Std std = new Std(stdId, stdName);

            System.out.println("国語: ");
            int scoreKorea = sc.nextInt();

            System.out.println("英語: ");
            int scoreEng = sc.nextInt();

            System.out.println("数学: ");
            int scoreMath = sc.nextInt();

            // 点数が有効な場合のみ配列に追加
            if (std.setScore(scoreKorea, scoreEng, scoreMath)) {
                stdList[i] = std;
                System.out.println("入力が完了しました。");
            } else {
                System.out.println("無効な点数です。再入力してください。");
                i--; // 入力をやり直すためにカウントを戻す
            }
        }
    }

    void prt() {
        if (stdList == null || stdList.length == 0) {
            System.out.println("入力された情報がありません。");
            return;
        }
        for (Std s : stdList) {
            if (s != null ) {
                System.out.println("ID: " + s.id);
                System.out.println("名前: " + s.name);
                System.out.println("国語: " + s.scoreKorea);
                System.out.println("英語: " + s.scoreEnglish);
                System.out.println("数学: " + s.scoreMath);
                System.out.println("合計:　" + s.getSum());
                System.out.println("平均:　" + s.getAvg());
                System.out.print("\n");
            }
        }
    }
}


public class MainTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StdScoreMgr stdMgr = null;  // 「変数だけ先に宣言して, まだオブジェクトは作ってない」って意味だよ。

        while (true) {
            // メニュー表示
            System.out.println("======= menu ========");
            System.out.println("1. 成績入力");
            System.out.println("2. 成績出力");
            System.out.println("3. プログラム終了");
            System.out.println("=====================");

            // メニュー選択
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("プログラムを終了します。");
                break;
            }
            // 選択されたメニューのプログラム実施
            switch (choice) {
                // 入力
                case 1:
                    System.out.println("入力学生数:　");
                    int stdNum = sc.nextInt(); // 学生数を入力
                    stdMgr = new StdScoreMgr(stdNum); // 学生管理オブジェクト作成
                    stdMgr.addStudent(); // 学生情報の入力開始
                    break;
                // データの出力
                case 2:
                    if (stdMgr != null) {
                        stdMgr.prt();
                    } else {
                        System.out.println("学生情報がまだ入力されていません。");
                    }
                    break;
                default:
                    System.out.println("1~3の数字を入力してください。");
            }
        }
    }
}

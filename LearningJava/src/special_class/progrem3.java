package special_class;

import java.util.Scanner;

public class progrem3 {
    public static void main (String [] args){
        // 事前予約システムのロジックをシミュレートするプログラムを作成する。
        // ユーザが特定のイベントの事前予約を進めるとき、ユーザの⼊⼒に応じて
        // 予約可能かどうかを判断し、それに応じた結果を出⼒する

        Scanner sc = new Scanner(System.in);
        // ユーザから年齢・イベントコード(E1,E2,E3)・希望日付(1~30)の入力をうける
        System.out.println("年齢を入力してください");
        int age = sc.nextInt();

        System.out.println("eventコードを入力してください");
        String code = sc.next();

        System.out.println("希望する日付を入力してください");
        int day = sc.nextInt();


        // 入力に合わせて結果を出力
        if (day >= 1 && day <= 30){

            switch (code) {
                case "E1":
                    // E1　18歳以上のみ可
                    if (age < 18) {
                        System.out.println("年齢制限のため不可");
                    } else {
                        System.out.println("予約完了");
                    }
                    break;
                case "E2":
                    // E2 偶数の日付のみ可
                    if (day % 2 == 0) {
                        System.out.println("予約完了");
                    } else {
                        System.out.println("日付制限のため不可");
                    }
                    break;
                case "E3":
                    //　E3　16歳以上で７の倍数の日付のみ
                    if (age < 16) {
                        System.out.println("年齢制限のため不可");
                    } else if (day % 7 != 0) {
                        System.out.println("日付制限のため不可");
                    } else {
                        System.out.println("予約完了");
                    }
                    break;
                default:
                    System.out.println("無効な⼊⼒です。プログラムを終了します");
            }
        }else{
            System.out.println("選択した⽇には予約できません");
            }
        }
    }


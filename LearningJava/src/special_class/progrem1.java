package special_class;

import java.util.Scanner;

public class progrem1 {
    public static void main(String[] args) {

        // 利用者から入力をうける
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // 年齢に合わせてメッセージを出力
        String message = "";

        if (age <= 12 ){
            message = "子供";
        }
        else if (age <= 18){
            message = "青少年";
        }
        else{
            message = "大人";
        }
        System.out.println(message + "利用券を使用できます。");

    }
}

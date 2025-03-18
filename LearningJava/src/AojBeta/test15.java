package AojBeta;

import java.util.Scanner;

public class test15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] nList = new int[n];

        for ( int i = 0 ; i < nList.length ; i++ ){
            nList[i] = sc.nextInt();
        }
        // リストの中身を順番に出力
        for (int value : nList){
            System.out.print(value + " ");
        }
        System.out.println();
        // リストの中身を逆に出力
        for (int i = n -1  ; i >= 0 ; i--){
            System.out.print(nList[i]);
            // 最後の数字の後には空白を入れないようにする
            if (i != 0){
                System.out.print(" ");
            }
        }
    }
}

package AojBeta;

import java.util.Scanner;

public class test11 {
    public static void main(String[]args){
        // n個の整数を入力し、それらの最小値、最大値、合計値を求めるプログラムを作成
        Scanner sc = new Scanner(System.in);

        // 整数の数n
        int n = sc.nextInt();

        int [] nList = new int [n];

        // n個の整数
        for( int i = 0; i < n; i++){
            nList[i] = sc.nextInt();
        }

        // 最小値
        int maxValue = nList[0];
        for( int i = 0 ; i < nList.length ; i++){
            if (maxValue < nList[i]){
                maxValue = nList[i];
        }
        }
        // 最大値
        int minValue = nList[0];
        for( int i = 0 ; i < nList.length ; i++){
            if (minValue > nList[i]){
                minValue = nList[i];
                }
        }

        int sum = 0;
        for(int value : nList){
            sum += value;
        }
        System.out.println(minValue + " " + maxValue+ " " + sum);
    }

}

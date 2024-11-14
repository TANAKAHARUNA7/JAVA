package VariableAndConstant1;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        // 入力を受けるためのコード
        Scanner sc = new Scanner(System.in);

        //　ユーザから入力を受ける
        System.out.print("年齢を入力してください : ");
        // 入力を保存
        int age = sc.nextInt();

        // 体重の入力を受ける
        System.out.print("体重を入力してください: ");
        // 入力を保存
        double weight = sc.nextDouble();


        // 年齢をdoubleに明⽰的に変換して体重と加算結果を出⼒
        System.out.println("年齢をdoubleに変換した後,体重と足した結果: " + ((double)(age )+ weight));
        // 体重をintに明⽰的に変換して年齢と加算結果を出⼒
        System.out.println("体重をintに変換した後,年齢と足した結果: " + ((int)(weight) + age));


        }



    }



package special_class;

import java.util.Scanner;

public class progrem2 {
    public static void main(String [] age) {
        Scanner sc = new Scanner(System.in);

        // 使用から三辺の入力を受ける
        System.out.println("三角形の辺を入力してください");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        // 三角形が形成できない場合
        if (input1 + input2 <= input3 || input3 + input2 <= input1 || input1 + input3 <= input2) {
            System.out.println("三角形を形成することはできません");
            return;
        // 三角形を形成することができる場合
        }else {
            // 正三角形
            if (input1 == input2 && input2 == input3) {
                System.out.println("正三角形");
            // 二等辺三角形
            }else if (input1 == input2 || input1 == input3 || input2 == input3){
                System.out.println("二等辺三角形");
            // 不等辺三角形
            }else {
                System.out.println("不等辺三角形");
            }
        }
    }
}

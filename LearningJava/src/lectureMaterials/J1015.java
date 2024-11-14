package lectureMaterials;

import java.util.Scanner;

public class J1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.使用者の入力を受ける
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // 2. 選択的実行（条件文使用）
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }else{
            System.out.println(number + " is odd.");

        }

        // 3. 反復実行（反復文使用）
        System.out.println("Counting down from " + number + " to 1: ");
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}

package lecture;

import java.util.Scanner;

public class J927 {
    public static void main(String[] args) {
        // 論理演算子：正と誤りを
        // 1 <= 入力 <= 10 -> Do something!

        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();

//        if (inputValue => 1) && (){}

        /////////////

        boolean isOpened = false;

        // 窓が開いている
        isOpened = true;

        // 窓が閉まっている
        isOpened = false;

        //
        if (!isOpened){
            System.out.println("Do something!");

        ///////////////////

        char foo = 'A'; // Aは整数にすると65
        System.out.println(foo);// A
            foo += 1;
            // foo = (char)(foo + 1); // char(A) + int -> int(65) + int(1) -> int(66)
        System.out.println(foo); // B


        }

    }







}

package Flow_control;

import java.util.Scanner;

public class Lab2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (true) {
            // 1~7사이의 정수르 받는다
            System.out.print("1~7사이의 정수를 입력하세요: ");
            input = sc.nextInt();

            // 이외 입력는  올바른 값을 입력할 때까지 재입력을 받는다
            if (input >= 1 && input <= 7) {
                break;
            }else{
            System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요.");
        }}

            String msg = "";
            switch (input) {
                // 토요일(6)과 일요일(7)은 “주말”
                case 1:
                    msg = "월요일,주중";
                    break;
                case 2:
                    msg = "화요일,주중";
                    break;
                case 3:
                    msg = "수요일,주중";
                    break;
                case 4:
                    msg = "목요일,주중";
                    break;
                case 5:
                    msg = "금요일,주중";
                    break;
                case 6:
                    msg = "토요일,주말";
                    break;
                case 7:
                    msg = "일요일,주말";
                    break;

                // 그 외 요일은 “주중”으로 구분하여 출력

            }
            System.out.println(msg);
        }
    }


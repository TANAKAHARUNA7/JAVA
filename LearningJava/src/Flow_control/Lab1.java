package Flow_control;

import java.util.Scanner;

public class Lab1 {
    public static void main(String [] args) {
        // 사용자가 입력한 나이를 기준으로 여러 연령대에 맞는 메시지를 출력하는
        // 프로그램을작성
        // 단, 음수를 입력할 경우 "나이는 음수가 될 수 없습니다. 다시 입력하세요."라는
        // 메시지를 출력하고, 올바른 값을 입력할 때까지 다시 입력을 받는다.

        Scanner sc = new Scanner(System.in);

        // task1
        int age = 0;

        while (true) {
            // 나이의 입력을 받는다
            System.out.println("나이를 입력하세요: ");
            age = sc.nextInt();

            // 나이가 음수이라면 재입력을 받는다
            if (age > 0) {
                break;
            } else {
                System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요");
            }
        }

        // take 2
        // 연령대에 맞는 메시지를 출력한다
        String msg = "";

        // ① 0 ~ 12세 "어린이“
        if (0 <= age && age <= 12) {
            msg = "어린이";
            // ② 13 ~ 17세 "청소년“
        } else if (13 <= age && age <= 17) {
            msg = "청소년";
            // ③ 18 ~ 64세 "성인“
        } else if (18 <= age && age <= 64) {
            msg = "성인";
        // ④ 65~ "노인"
        }else{
            msg = "노인";
        }
        System.out.println(msg);
    }
}

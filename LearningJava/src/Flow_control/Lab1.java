package Flow_control;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        // 사용자가 입력한 나이를 기준으로 여러 연령대에 맞는 메시지를 출력하는
        // 프로그램을작성
        // 단, 음수를 입력할 경우 "나이는 음수가 될 수 없습니다. 다시 입력하세요."라는
        // 메시지를 출력하고, 올바른 값을 입력할 때까지 다시 입력을 받는다.

        // 나이를 입력을 받는다
        Scanner sc = new Scanner(System.in);
        int age = 0;

        while (true) {

            System.out.println("나이를 입력하세요: ");
            age = sc.nextInt();

            if (age < 0) {
                System.out.println("나이는음수가될수없습니다. 다시입력하세요.");
            } else {
                break;
            }
        }
            String msg = "";
            // ① 0~12 "어린이“
            if (age >= 0 && age <= 12) {
                msg = "어린이";
            }
            // ② 13~17 "청소년“
            else if (age <= 17) {
                msg = "청소년";
            }
            // ③ 18~64 "성인“
            else if (age <= 64) {
                msg = "성인";
            }
            // ④ 65~ "노인"
            else {
                msg = "노인";
            }
            System.out.println(msg);
        }
    }

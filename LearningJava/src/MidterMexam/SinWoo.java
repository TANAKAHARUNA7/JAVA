package MidterMexam;
import java.util.Scanner;
public class SinWoo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int score = 0, count = 1;
        char[] slot = {'+', '-', '*'};
        // 3개의 슬롯을 랜덤으로 설정
        char[] bar = new char[3];


        while (true) {
            // 게임 종료 조건
            if (score >= 5) {
                System.out.print("승리");
                break;
            } else if (score <= -5) {
                System.out.print("패배");
                break;
            }

            System.out.println(count + "번째 게임.");
            System.out.println("아무거나 누르고 시작.");
            sc.nextLine();  // 아무 키 입력 받기

            for (int i = 0; i < 3; i++) {
                int random = (int) (Math.random() * 3);
                bar[i] = slot[random];
            }

            // 슬롯 출력
            System.out.println("========================");
            for (char c : bar) {
                System.out.print("  " + c + "  : \t");
            }
            System.out.println("\n========================");

            // 연속된 값이 판별
            int conCharCount = 0;
            for (int i = 0; i < bar.length - 1; i++) {
                if (bar[i] == bar[i + 1]) {
                    conCharCount++;
                }
            }

            // 보너스 점수 처리
            String result = "";
            if (conCharCount == 2) {
                // 3개가 같은 경우
                count++;
                switch (bar[0]) {
                    case '-':
                        result = " 3 Combo - 보너스 점수 3점 감점";
                        score -= 3;
                        break;
                    case '+':
                        result = " 3 Combo - 보너스 점수 3점 획득";
                        score += 3;
                        break;
                    default:
                        result = " 3 Combo - 보너스 점수 5점 획득";
                        score += 5;
                }
                System.out.println(bar[0] + result);
            } else if (conCharCount == 1) {
                // 2개가 나란히 같은 경우
                count++;
                switch (bar[1]) { //
                    case '-':
                        result = " 2 Combo - 보너스 점수 1점 감점";
                        score--;
                        break;
                    case '*':
                        result = " 2 Combo - 보너스 점수 2점 획득";
                        score += 2;
                        break;
                    default:
                        result = " 2 Combo - 보너스 점수 1점 획득";
                        score++;
                }
                System.out.println(bar[1] + result);
            }
            // 현재 점수 출력
            System.out.println("현재 점수: " + score);
            count++;
        }
    }
}

package MidterMexam;

import java.util.Scanner;

public class anser {
    public static void main(String[] args) {
        final int NUM_OF_ITEM = 3;

        //  연산자 배열 생성
        // 3까지 연산자(+, -, *)를 포함하는 char type 1차원 배열을 생성한다
        char list1 [] = {'+', '-', '*'};

        // 선택된 3개의 연산자를 1차원 Array에 저장하기 위한 배열
        char array[] = new char [NUM_OF_ITEM];

        // 게임 count수 초기화
        int GameCount = 1;

        // 점수 계산
        int score = 0;

        // 입력을 받기위해
        Scanner sc = new Scanner(System.in);
        String stert = "";

        while(true) {

            //  게임 종료 조건
            // 점수 5이상 -> "승리" 출력하고 종료
            // 점수 -5이하 -> "패배" 출력하고 종료
            if (score >= 5){
                System.out.print("승리🥰 프로그램 종료");
                break;
            }
            if (score <= -5){
                System.out.print("패배😢 프로그램 종료");
                break;
            }

            // 매 라운드가 끝나면 현재 횟수를 출력
            System.out.println(GameCount + "번째 게임");

            // 게임 시작하기 위한 아무 값이나 입력을 받는다
            System.out.print("게임 시작하려면 아무 값이나 입력하세요: ");
            stert = sc.nextLine();

            // 2. 랜덤 연산자 선택
            // 각 라운드에서 슬롯머신을 돌리면 +, -, * 문자 중 3개가 무작위로 선택
            for (int j = 0 ; j < list1.length ; j++) {
                for (int i = 0 ; i < list1.length ; i++ ) {
                    int rndnum = (int)(Math.random() * 3);
                    // 선택된 3개의 연산자를 1차원 Array에 저장
                    array[i] = list1[rndnum];
                }
            }

            // 출력
            System.out.println("-------------------");
            for (char item : array){
                System.out.print("\t" + item);
            }
            System.out.println("\n-----------------");

            // 3. 콤보 확인
            char selectedItem = 0;
            // 포인트 점수 계산
            // 연속된 문자 카운트
            int conCharCount = 0;
            for (int i = 0; i < list1.length - 1 ; i++) {
                if (array[i] == array[i + 1]) {
                    conCharCount++;
                    // 연속된 문자 종류 저장
                    selectedItem = array[i];
                }
            }

            String msg = "";
            // A. 연속된 연산자가 2 개일 경우:
           if (conCharCount == 1){
               switch (selectedItem){
                   // ++ -> + 1점
                   case '+':
                       score += 1;
                       msg = "+ 2 Combo - 보너스 점수 1점 획득";
                       break;
                   // -- -> - 1점
                   case '-':
                       score -= 1;
                       msg = "- 2 Combo - 보너스 점수 1점 감점";
                       break;
                   // ** -> + 2점
                   default:
                       score += 2;
                       msg = "* 2 Combo - 보너스 점수 2점 획득";
                       break;
                   }
               System.out.printf(msg);
            // B. 연속된 연산자가 3 개일 경우:
           } else if (conCharCount == 2) {
               switch (selectedItem) {
                   // +++ -> + 3점
                   case '+':
                       score += 3;
                       msg = "+ 3 Combo - 보너스 점수 3점 획득";
                       break;
                   // --- -> - 3점
                   case '-':
                       score -= 3;
                       msg = "- 3 Combo - 보너스 점수 3점 감점";
                       break;
                   // *** -> + 5점
                   case '*':
                       score += 5;
                       msg = "* 3 Combo - 보너스 점수 5점 획득";
                       break;
               }
               System.out.println(msg);
               }
            // 게임 실행 횟수를 count
            GameCount++;

            System.out.println("\n현재 점수 : " + score + "\n");

        }
    }
}





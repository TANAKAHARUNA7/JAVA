package MidterMexam;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        // (+,*,-)3개의 심볼을 가진 배열을 생성한다
        char operators [] = {'+','*','-'};

        final int NUM_OF_ITEMS = 3;

        // 랜덤으로 선택한 심볼을 처장
        char selectedOperators [] = new char[NUM_OF_ITEMS];
//        char array [] = {'*', '*', '*'};

        Scanner sc = new Scanner(System.in);

        // score
        int score = 0;

        // Game count
        int GanmeCount = 1;

        while (true) {

            // 계임 종료 조건
            // 5점 이상
            if (score >= 5){
                System.out.print("승리! 계임종료");
                break;
            }
            // -5점 이하
            if (score <= -5){
                System.out.print("패배! 계임종료");
                break;
            }

            // 매 게임마다 계임 횟수를 표시
            System.out.println(GanmeCount + "번째 게임");

            System.out.print("계임 시작하기위해 키를 느러주세요: ");
            // 아무것 나 입력 받으면 계임 시작
            String  start = sc.nextLine();

            // 배열 안에 있는 심볼을 랜덤으로 3개 선택
            for ( int i = 0 ; i < operators.length ; i++ ){
                int rndSymbol = (int) (Math.random() * 3);
                selectedOperators[i] = operators[rndSymbol];
            }

            // 슬롯 결과를 출력
            System.out.println("================================");
            for (char value : selectedOperators){
                System.out.print("\t" + value + "\t:" );
            }
            System.out.println("\n================================\t");

            // 연속 횟수를 count
            int Combo = 0;
            // 연속한 symbol
            char symbol = ' ';

            // 신볼이 연속해서 나오면 보너스 점수
            for ( int i = 0 ; i < operators.length - 1 ; i++ ){
                if (selectedOperators[i] == selectedOperators[ i +1 ]){
                    Combo++;
                    symbol = selectedOperators[i];
                }
            }

            String msg = "";
            // 2개일 경우
            if (Combo == 1){
                switch (symbol){
                    // ++ -> +1점
                    case '+':
                        score ++;
                        msg = symbol + "2Combo - 보너스 점수 1점 획득";
                        break;
                    // -- -> -1점
                    case '-':
                        score --;
                        msg = symbol + "2Combo - 보너스 점수 1점 감점";
                        break;
                    // ** -> +2점
                    default:
                        score += 2;
                        msg = symbol + "2Combo - 보너스 점수 2점 획득";
                        break;
                }
                System.out.println(msg);
            }
            // 3개일 경우
            if (Combo == 2){
                switch (symbol){
                    // +++ -> +3점
                    case '+':
                        score += 3;
                        msg = symbol + "2Combo - 보너스 점수 3점 획득";
                        break;
                    // --- -> -3점
                    case '-':
                        score -= 3;
                        msg = symbol + "2Combo - 보너스 점수 3점 감점";
                        break;
                    // *** -> +5점
                    default:
                        score += 5;
                        msg = symbol + "2Combo - 보너스 점수 5점 획득";
                        break;
                }
                System.out.println(msg);
            }

            // 매 라운드가 끝나면 현재 점수를 출력
            System.out.println("현재 점수: " + score + "\n");

            GanmeCount++;
        }
    }
}

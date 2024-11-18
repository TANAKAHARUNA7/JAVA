package MidterMexam;

import java.util.Scanner;

public class ploblem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // (*,-,+) 연산자를 포함하는 char type 1차워 배열을 생성
        char operator [] = {'+','-','*'};

        // user 입력한 정수
        int value = 0;

        // score
        int score = 0;

        // GameCount
        int GameCount = 1;

        while (true) {

            // 계임 종료
            // 5점 이상
            if (score >= 5){
                System.out.println("승리! 계임종료");
                break;
            }
            // -5점 이하
            if (score <= -5){
                System.out.println("패배! 계임 종료");
                break;
            }

            // 매 로은드 횟수를 표시
            System.out.println("----Round " + GameCount + "---");

            // 반복
            while (true) {
                System.out.print("3~7사이의 정수를 입력하세요: ");
                // 사용자로부터 3~7사이의 정수를 입력받아 슬롯 개수를 설정
                value = sc.nextInt();
                // 입력값이 유호하지 않으면 오류 메시지출력
                if (value >= 3 && value <= 7) {
                    break;
                }
                System.out.println("재입력하세요.");
            }

            char itemsList [] = new char [value];

            // 성정된 슬롯 개수만큼 연산자를 무작위로 선택하여 결과 배열 생성
            for ( int i = 0 ; i < itemsList.length ; i++ ){
                int choice = (int)(Math.random() * 3);
                itemsList[i] = operator[choice];
            }

            // 슬롯 결과를 출력
            System.out.print("Result: [");
            for ( char item : itemsList ){
                System.out.print(item + ",");
            }
            System.out.println("]");


            // Combo 횟수
            int Combo = 0;

            //bonus
            int bonus = 0;



            // symbol
            char symbol = ' ';

            // 연속된 동일 연산자가 있는지 확인
            for ( int i = 0 ; i < itemsList.length - 1 ; i++ ){
                if (itemsList[i] == itemsList[i +1]){
                    Combo++;
                    symbol = itemsList[i];
                }
            }

            // 연속된 동일 연산자의 개수를 그룹으로 탐지하여 점수계산
            // 2개일 경우
            if (Combo == 1){
                switch (symbol){
                    // ++ -> +1
                    case '+':
                        bonus++;
                        break;
                    // -- -> -1
                    case '-':
                        bonus--;
                        break;
                    // ** -> +2
                    default:
                        bonus += 2;
                }
            }
            //3개일 경우
            if (Combo == 2) {
                switch (symbol) {
                    // +++ -> +3
                    case '+':
                        score += 3;
                        break;
                    // --- -> -3
                    case '-':
                        break;
                    // *** -> +5
                    case  '*':
                        score += 5;

                }
            }

            // 현재 score 표시

            GameCount ++;


        }




    }
}

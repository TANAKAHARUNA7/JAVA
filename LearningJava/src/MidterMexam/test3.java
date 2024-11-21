package MidterMexam;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 세 가지 연산자(+, -, *)를 포함하는 char type 1차원 배열을 생성
        char items [] = {'+','*','-'};

        // user로부터 입력을 받는다
        int value = 0;

        // score
        int score = 0;


        while (true){
            // 사용자로부터 3~7 사이의 정수를 입력받아 슬롯 개수를 설정
            System.out.print("Enter the number of slots (3~7): ");
            value = sc.nextInt();

            // 입력값이 유효하지 않으면 오류 메시지를 출력하고 재입력 요구
            if(value >= 3 && value <= 7){
                break;
            }
        }

        // 2. 연산자 배열 생성
        char slotlist [] = new char [value];

        while (true){

            // 계임 종료 조건
            // 5점 이상
            if ( score >= 5){
                System.out.println("Congratulations, you win!");
                break;
            }
            // -5점 이하
            if ( score <= -5  ){
                System.out.println("Rose..");
                break;
            }





            // 3. 랜덤 슬롯 결과 생성
            // 설정된 슬롯 개수만큼 연산자를 무작위로 선택한다
            for ( int i = 0 ; i < slotlist.length ; i++ ){
                int rndnum = (int)(Math.random() * 3);
                slotlist[i] = items[rndnum];
            }

            // 슬롯 결과를 출력
            System.out.print("Result:[");
            for( int i = 0 ; i < slotlist.length ; i++ ){
                System.out.print( slotlist[i] + ((i < slotlist.length - 1) ? "," : "]") );
            }
            System.out.println();

            // 4. 점수 규칙
            // 연속된 동일 연산자의 개수를 그룹으로 탐지하여 점수 계산
//            for(){
//                // 2 개일 경우:
//                // ++ -> +1
//                // -- -> -1
//                // ** -> +2
//
//
//
//            }





            // 3 개일 경우:
            // +++ -> +3
            // --- -> -3
            // *** -> +5

        }





    }
}

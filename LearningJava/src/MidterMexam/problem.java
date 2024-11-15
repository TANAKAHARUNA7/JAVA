package MidterMexam;
import java.util.Scanner;
public class problem {
    public static void main(String [] args){

        //  연산자 배열 생성
        // 3까지 연산자(+, -, *)를 포함하는 char type 1차원 배열을 생성한다
        char list1 [] = {'+', '-', '*'};

        // 선택된 3개의 연산자를 1차원 Array에 저장하기 위한 배열
        char array[] = new char [3];

        // 게임 count수 초기화
        int GameCount = 0;

        // 점수 계산
        int score = 0;

        // 입력을 받기위해
        Scanner sc = new Scanner(System.in);
        String stert = "";

        while(true) {
            // 매 라운드가 끝나면 현재 횟수를 출력
            System.out.println((GameCount + 1 ) + "번째 게임");

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
            System.out.println("\n-------------------------------");
            System.out.println("\t"+array[0] + "\t:\t" + array[1] + "\t:\t" + array[2] + "\t:");
            System.out.println("-------------------------------");

            // 3. 콤보 점수 계산
                    // ++ -> + 1점
                if (array[0] == array[1] || array[1] == array[2]) {
                    if (array[0] == '*' && array[1] == '*' || array[1] == '*' && array[2] == '*'){
                        score += 1;
                    // -- -> - 1점
                    }else if (array[0] == '-' && array[1] == '-' || array[1] == '-' && array[2] == '-'){
                        score -= 1;
                    // ** -> + 2점
                    }else{
                        score += 2;
                    }
            }
            // B. 연속된 연산자가 세 개일 경우:
            // +++ -> + 3점
            // --- -> - 3점
            // *** -> + 5점
                else if(array[0] == array[1] && array[1] == array[2]){
                    if(array[0] == '+' && array[1] == '+' && array[2] == '+' ){
                        score += 3;
                    }else if(array[0] == '-' && array[1] == '-' && array[2] == '-' ){
                        score -= 3;
                    }else{
                        score += 5;
                    }
                }

            // 4. 게임 종료 조건
            // 점수 5이상 -> "승리" 출력하고 종료
            // 점수 -5이하 -> "패배" 출력하고 종료




            // 게임 실행 횟수를 count
            GameCount++;


        }









        // A. 연속된 연산자가 두 개일 경우:
        // ++ -> + 1점
        // -- -> - 1점
        // ** -> + 2점

        // B. 연속된 연산자가 세 개일 경우:
        // +++ -> + 3점
        // --- -> - 3점
        // *** -> + 5점

        // 4. 게임 종료 조건
        // 점수 5이상 -> "승리" 출력하고 종료
        // 점수 -5이하 -> "패배" 출력하고 종료








    }
}




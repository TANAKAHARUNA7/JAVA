package SelfStudy;

import java.util.Scanner;

// 학생 정보를 관리하는 class
class Stds {
    // ID, 이름, 국어, 영어, 수학, 합계점수, 평균
    int id;
    String name;
    int scoreNational;
    int scoreMath;
    int scoreEng;
    int sum;
    float avg;

    Stds studentList;

    void setScore(int argNational, int argMath, int argEng){
        // 정수 0 ~ 100 이위는 오류
        if (argNational < 0 || argMath < 0 || argEng < 0
                || argNational > 100 || argMath > 100 || argEng > 100){
            System.out.println("입력이 올바르지 않습니다.");
            return;
        }

        scoreNational = argNational;
        scoreMath = argMath;
        scoreEng = argEng;

    }




}
// 학생 정보 입력을 받는 class
class StdMng extends Stds {

    Scanner sc = new Scanner(System.in);

    // 입력 저리
    public void input(){
        System.out.println("국어: ");
        int national = sc.nextInt();

        System.out.println("수학: ");
        int math = sc.nextInt();

        System.out.println("영어: ");
        int english = sc.nextInt();

        super.setScore(national, math, english);




    }


}

public class Day_4_13 {
    public static void main(String[] args) {
        // 학생의 성적을 받고 배열에 저장, 출력하는 프로그램
        Scanner sc =new Scanner(System.in);
        Stds stu;

        while(true){
            // menu를 출력한다
            System.out.print("======== menue ========");
            System.out.println("\n1. 입력");
            System.out.println("\n2. 출력");
            System.out.println("\n3. 프로그램 종료");

            int choice = sc.nextInt();
            // menu에 따라 프로그램 실행
            // 3. 프로그램 종료
            if(choice == 3){
                System.out.println("프로그램 종료");
                break;
            }

            switch(choice) {
                // 1. 입력
                case 1:
                 // 입력 수 받기
                    System.out.println("입력 수 를 입력하세요: ");
                    int stuNum = sc.nextInt();



                // 2. 출력
            }

        }



}
}

package oop;

import java.util.Scanner;

// 학생 한명 분의 데이터 관리
class Students {
    // ID, 이름, 국어, 영어, 수학, 합계, 평균
    int id;
    String name;
    int scoreKorea;
    int scoreEnglish;
    int scoreMath;
    int sum;
    float avg;

    // 생성자 메서드 (ID, name 입력을 받고 초기화)
    Students(int argId, String argName) {
        id = argId;
        name = argName;
    }

    // 점수 설치
    boolean setScore(int argKorea, int argEnglish, int argMath) {
        // 올바른 점수인지 확인
        if (argKorea > 100 || argEnglish > 100 || argMath > 100) {
            return false;
        }
        if (argKorea < 0 || argEnglish < 0 || argMath < 0) {
            return false;
        }
        scoreKorea = argKorea;
        scoreEnglish = argEnglish;
        scoreMath = argMath;
        return true;
    }

    // 합계 메서드
    int getSum() {
        sum = scoreKorea + scoreMath + scoreEnglish;
        return sum;
    }

    // 평균 메서드
    float getAvg() {
        avg = (float) getSum() / 3;
        return avg;
    }

    // 필요시 각 점수 출력 메서드
    int getScoreKorea() {
        return scoreKorea;
    }

    int getScoreEnglish() {
        return scoreEnglish;
    }

    int getScoreMath() {
        return scoreMath;
    }
}

// 여러 학생 입력와 출력 관리
class StdMgr {
    int stdOfNumber;
    Students[] stdList;

    // 입력된 수로 배열을 작성
    StdMgr(int argStdOfNum) {
        stdOfNumber = argStdOfNum;
        stdList = new Students[argStdOfNum];
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < stdOfNumber; i++) {

            // ID, 이름을 받고 한명의 object 생성
            System.out.println("ID를 입력하세요: ");
            int id = sc.nextInt();
            System.out.println("이름을 입력하세요: ");
            String name = sc.next();

            // 생성자 호출
            Students std = new Students(id, name);

            // 성적 입력을 받는다
            System.out.println("국어 점수: ");
            int scoreKorea = sc.nextInt();
            System.out.println("영어 점수: ");
            int scoreEnglish = sc.nextInt();
            System.out.println("수학 점수: ");
            int scoreMath = sc.nextInt();

            // 점수 set
            if (std.setScore(scoreKorea, scoreMath, scoreEnglish)) {
                stdList[i] = std;
                System.out.println("성적 입력이 완료했습니다.");
            } else {
                System.out.println("올바른 점수가 아님니다.재 입력하세요.");
                i--;
            }
        }
    }

    // 성적 출력 메소드
    void prt() {
        if (stdList == null || stdList.length == 0) {
            System.out.println("출력내용이 없습니다.");
            return;
        }
        for (Students s : stdList) {
            if( s != null){
                System.out.println("ID: " + s.id);
                System.out.println("이름: " + s.name);
                System.out.println("국어: " + s.scoreKorea);
                System.out.println("영어: " + s.scoreEnglish);
                System.out.println("수학: " + s.scoreMath);
                System.out.println("합계: " + s.getSum());
                System.out.println("평균: " + s.getAvg());
            }
        }
    }
}


public class MainTest6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StdMgr stds = null;  // 변수만 선언하고 아직 object 는 만들어지 않은 상태

        // 메뉴출력 (3을 입력 될 떄까지 무한 )
        while (true) {
            System.out.println("======== 메뉴 ========");
            System.out.println("1. 성적을 입력");
            System.out.println("2. 성적을 출력");
            System.out.println("3. 프로글램 종료");
            System.out.println("=====================");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("프로글램 종료합니다");
                break;
            }

            switch (choice) {
                case 1:
                    // 입력하는 학생 수의 입력을 받는다
                    System.out.println("입력하는 학생수를 입력하세요: ");
                    int stdOfNum = sc.nextInt();
                    // 배열을 만들기 위해 생성자를 호출
                    stds = new StdMgr(stdOfNum);

                    stds.input();
                    break;
                case 2:
                    stds.prt();


            }

        }


    }
}

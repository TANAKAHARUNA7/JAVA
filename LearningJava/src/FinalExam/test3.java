package FinalExam;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class test3 {

    static void menu() {
        System.out.println("===== 빈고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 종료");
    }


    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int menuInput = 0;
        int sizeN = 0;
        int start = 0;
        int end = 0;
        int sizeM = 0;
        int[][][] bingoBord = new int[0][][];

        while (true) {

            menu();
            System.out.println("메뉴 선택: ");
            menuInput = sc.nextInt();

            if (menuInput == 4) {
                break;
            }

            switch (menuInput) {
                case 1:
                    while (true) {
                        System.out.println("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
                        sizeN = sc.nextInt();

                        if (sizeN >= 3 && sizeN <= 9 && sizeN % 2 != 0) {
                            break;
                        }
                        System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
                    }

                    int bingoSize = sizeN * sizeN;

                    while (true) {
                        System.out.print("난수 범위의 시작값을 입력하세요: ");
                        start = sc.nextInt();
                        System.out.print("난수 범위의 종료값을 입력하세요: ");
                        end = sc.nextInt();

                        if ((end - start + 1) >= bingoSize) {
                            break;
                        }

                        System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
                    }

                    while (true) {
                        System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1이상 7이하): ");
                        sizeM = sc.nextInt();
                        // 제대로 입력했다면, 탈출
                        if (sizeM >= 1 && sizeM <= 7) {
                            break;
                        }
                        System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
                    }

                        bingoBord = new int[sizeM][sizeN][sizeN];

                        int randNum = 0;
                        boolean flag = false;

                        for (int page = 0; page < sizeM; page++) {
                            int[] randList = new int[bingoSize];

                            for (int i = 0; i < bingoSize; ) {
                                randNum = (int) (Math.random() * (end - start + 1)) + start;
                                flag = false;

                                for (int j = 0; j < i; j++) {
                                    if (randList[j] == randNum) {
                                        flag = true;
                                        break;
                                    }
                                }

                                if (!flag) {
                                    randList[i] = randNum;
                                    i++;
                                }
                            }

                            int v = 0;
                            for (int row = 0; row < sizeN; row++) {
                                for (int col = 0; col < sizeN; col++) {
                                    bingoBord[page][row][col] = randList[v];
                                    v++;
                                }
                            }
                        }

                        break;

                        case 2:


                        case 3:

                            for (int page = 0; page < sizeM; page++) {
                                System.out.println("빙고 매트릭스 # " + (page + 1));
                                for (int row = 0; row < sizeN; row++) {
                                    for (int col = 0; col < sizeN; col++) {
                                        System.out.print(bingoBord[page][row][col] + "\t");
                                    }
                                    System.out.println();
                                }
                            }
                            break;

                    }
                    }


            }


        }

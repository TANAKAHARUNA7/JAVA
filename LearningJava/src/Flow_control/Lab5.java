package Flow_control;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 N을 입력 받는다
        int N = 0;

        while (true) {
            System.out.println("정수 N를 입력하세요: ");
            N = sc.nextInt();

            // 0 또는 음의 정수가 입력되면 재입력 요청
            if (N > 0) {
                break;
            }
            System.out.println();
        }

        // 입력받은 N개의 int형 원소를 가지는 1차원 배열을 생성
        int[] itemList = new int[N];


        int start = 0;
        int end = 0;

        while (true) {
            // 키보드로부터 start와 end 값을 입력 받는다
            System.out.println("start값을 입력 하세요: ");
            start = sc.nextInt();

            System.out.println("end값을 입력 하세요: ");
            end = sc.nextInt();

            // end - start + 1의 범위가 배열의 크기보다 작으면 재입력 요청
            if (end - start + 1 > itemList.length) {
                break;
            }
            System.out.println("재입력 하세요.");
        }

        //  배열의 각 원소에 저장
        for (int i = 0; i < itemList.length; i++) {
            //  start <= randValue <= end 범위의 난수를 생성
            double randomnum = (int) (Math.random() * ( end - start + 1 ))+ start;
            itemList[i] = (int)randomnum;
        }

        // 배열의 모든 원소 값을 출력
        for( int value : itemList){
            System.out.println(value);
        }

        }
    }


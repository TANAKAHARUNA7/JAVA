package Flow_control;

import java.util.Scanner;

public class Lab4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //  정수 N을 입력받아, N개의 int형 원소를 가지는 1차원 배열을 생성해 값을 입력받고
        // 배열의 모든원소를 출력.  그리고 최대값, 최소값, 평균값을 계산 하여출력

        int N = 0;

        while (true) {
            // 정수 N을 입력 받는다
            System.out.print("정수 N를 입력하세요: ");
            N = sc.nextInt();

            // 1 ~ 10 이외는 재입력
            if (N >= 1 && N <= 10) {
                break;
            }
            System.out.println("1 ~ 10사이에 입력하세요.");
        }

        // N개의 int형 원소를 가지는 1차원 배열을 생성
        int[] itemList = new int[N];

        // user부터 정수를 입력 받아 배열의 각 원소에 순서대로 저장
        int item = 0;

        System.out.println("저장 하고 싶은 정수를 N게 입력하세요.");
        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "번째 입력 값");
            item = sc.nextInt();
            itemList[i] = item;
        }

        // 입력된 배열의 모든 원소값을 쉼표(,)로 구분하여 출력
        for (int i = 0; i < itemList.length; i++) {
            System.out.print(itemList[i] + ((i < itemList.length - 1) ? "," : " "));
        }

        // 최소값
        int small = itemList[0];
        // 최대값,
        int Big = itemList[0];
        // 합계
        int sum = 0;
        // 평균
        float avg = 0;

        for (int value : itemList) {
            if (value > Big) {
                Big = value;
            } else if (value < small) {
                small = value;
            }
            sum += value;
        }
        avg = (float) sum / itemList.length;

        System.out.println("\n최대값: " + Big);
        System.out.println("최소값: " + small);
        System.out.printf("平均: %.2f", avg);

    }
}

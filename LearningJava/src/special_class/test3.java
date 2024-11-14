package special_class;

import java.util.Scanner;

public class test3 {
    public static void main(String [] args){
        // 사용자로부터 배열 크기 N을 입력받아,
        // N개의 정수를 저장할 수 있는 1차원 배열을 생성하라.
        // 단, N이 0 또는 음수이면 재입력을 요구한다.

        // 사용자로부터 난수 범위를 지정할 start, end 값을 입력받아,
        // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장하라.
        // 단, (end - start + 1) 값이 배열의 크기 N보다 작을 경우
        // 다시 입력을 요구한다.
        // 예) N = 5 -> 5개의 원소를 가지는 1차원 배열 생성
        //     start = 10, end = 12 -> 배열 원소는 10, 11, 12 중 하나의 값이어야 함
        // 생성된 배열의 모든 원소 값을 출력하

        // mission
        // ユーザーから配列サイズ N を入力し、
        // N個の整数を格納できる一次元配列を作成します。
        // ただし、Nが0または負の数であれば、再入力を要求します。
        // ユーザから乱数範囲を指定する start, end の値を受け取り、
        // start <=乱数値<= end範囲の乱数を生成して配列に保存します。
        // ただし、(end - start + 1)の値が配列のサイズNより小さい場合
        //再入力を要求します。
        //例）N = 5 - > 5つの要素を持つ1次元配列の作成
        // start = 10、end = 12 - >配列要素は10、11、12のいずれかの値でなければなりません
        //生成された配列のすべての要素値を出力する

        /////////////////////////////////////////////////////


        // task1
        // 사용자부터 배열 크기 N의 입력을 받는 변수를 초기화한다.
        Scanner sc = new Scanner(System.in);
        int inputN = 0;

        while (true){
            // 사용자로부터 배열 크기 N 입력을 받는다
            System.out.println("0以上の整数を入力してください:　");
            inputN = sc.nextInt();
            // 0 또는 음수이면 재입력 요청
            if (inputN > 0){
                break;
            }
        }
        // N개의 정수를 저장할 수 있는 1차원 배열 만들기
        int array [] = new int[inputN];


        // task2
        // 사용자로부터 무작위로 범위를 지정한다 start, end 의 값을 받는다
        int start = 0;
        int end = 0;

        // (end - start + 1)의 값이 배열의 크기 N보다 작은 경우 재입력

            System.out.println("start値を入してください：　");
            start = sc.nextInt();
            System.out.println("end値を入してください：　");
            end = sc.nextInt();





        // start <= 난수 <= end 범위의 랜덤 정수를 N개 생성
        for (int i = 0 ; i < array.length ; i++) {
            // 사용자로부터 랜덤으로 범위를 지정하는 start, end 의 값을 받는다
            double randoNum = (int)(Math.random() * (end - start) + 1 ) + start;
            array[i] = (int)randoNum;
        }

        // task3
        // 생성된 배열의 모든 요소 값을 출력
        for (int value : array){
            System.out.print(value + ",");
        }
    }
}

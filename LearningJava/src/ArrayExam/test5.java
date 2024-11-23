package ArrayExam;

public class test5 {
    public static void main(String [] args){

//        // 1．配列（Array)　サイズを広げる
//        int[] numbers = new int[3];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//
//        // もっとたくさんのデータを保存するために配列の大きさを増やさなければいけない状況
//        int[] newNumbers = new int [5];
//
//        // 既存の配列内容を新しい配列にコピー
//        for (int i = 0 ; i < numbers.length ; i++ ){
//            newNumbers[i] = numbers[i];
//        }
//        for( int value : newNumbers){
//            System.out.print(value + ":"); // 10,20,30,0,0
//        }
//
//        // 新しい要素を追加
//        newNumbers[3] = 40;
//        newNumbers[4] = 50;

        //////////////////////////////////////////////

//        // 2.挿入
//        int [] numbers = {10, 20, 30, 40};
//
//        // インデックス2に'25'を挿入したい場合
//        int [] newNumbers = new int [5];
//
//        // numbers [1]までを -> newNumbers配列にコピー
//        for ( int i = 0 ; i < 2 ; i++ ){
//            newNumbers[i] = numbers[i];
//            System.out.print(newNumbers[i]); // 10, 20
//        }
//        System.out.println();
//
//        // newNumbers[2]に'25'を挿入
//        newNumbers[2] = 25;
//
//        // numbers[30, 40]を newNumbersの配列にコピー
//        for( int i = 3 ; i < 5 ; i++ ){
//            newNumbers[i] = numbers[i - 1];
//        }
//
//        for( int value : newNumbers ){
//            System.out.print(value + ":");

        ////////////////////////////////////////////////////////////////

        // 3. 削除
        int [] bar = {10, 20, 30, 40};

        for( int i = 1 ; i < bar.length -1 ; i++ ){
            bar[i] = bar[i + 1];
        }
        bar[bar.length - 1] = 0; // bar[3] = 0;

        for ( int value : bar ){
            System.out.print(value + ":");
        }













    }



    }


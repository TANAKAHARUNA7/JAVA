package Method;

public class Ex4 {

    // 配列（1次元）の元素を出力するメソッド
    static  void vectorMatrix(int[] argVector){
        for(int i = 0 ; i < argVector.length; i++ ){
            System.out.print(argVector[i] + " ");
        }
    }

    // 配列（2次元）の要素を出力するメソッド
    static void printMatrix(int [][] argMatrix){
        for ( int [] vector : argMatrix ){
            vectorMatrix(vector);
        }
    }

    // 指定された値で初期化された配列を生成するメソッド
    static int[][] createMatrix(int row, int col , int value){

        int [][] temp = new int [2][1];

        // Matrix生成               2     3
        int [][] matrix = new int [row][col];

        // Matrix初期化
        for ( int j = 0  ; j < matrix.length ; j++ , value += 10){
            for (int i = 0, subValue = 0; i < matrix[j].length ; i++, subValue += 1 ){
                matrix[j][i] = value + subValue;
            }
        }
        // 生成されたMatrixを変換
        return matrix;
    }

    public static void main(String [] args){
       // 2 X 3　の大きさのMatrixを生成
       int [][] bar = createMatrix(2,3,10);

       // 生成されたMatrixを出力
       printMatrix(bar);

    }
}

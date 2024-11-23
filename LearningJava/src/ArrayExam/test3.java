package ArrayExam;

public class test3 {
    public static void main(String [] args){

        int [][] bar = new int [3][3];

        int [][] foo = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        int value = 0;

        // Loop : row 0 -> 2
        for (int row = 0 ; row < bar.length ; row ++ ){
            // Loop : col 0 -> 2
            for ( int col = 0 ; col < bar[row].length ; col++ ){
                bar[row][col] = value;
                value += 10;
            }
        }
    }
}

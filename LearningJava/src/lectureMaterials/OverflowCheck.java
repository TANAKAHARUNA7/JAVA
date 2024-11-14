package lectureMaterials;

public class OverflowCheck {
    public static void main(String[]args){
        try {
            int maxInt = Integer.MAX_VALUE;
            System.out.println("最大値:　" + maxInt);

            // オーバーフロー感知
            int result = Math.addExact(maxInt, 1);
            System.out.println("結果:　" + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }



        


    }



}

package VariableAndConstant1;

public class Lab2 {
    public static void main(String[] args) {
        byte maxValue = 127;
        byte minValue = -128;

        // byte型は‐128~127までの範囲の整数を扱える型であるため
        maxValue++;  // オーバーフロー発生
        minValue--;  // アンダーフロー発生

        System.out.println("オーバーフローになった値 :" + maxValue);
        System.out.println("アンダーフローになった値 :" + minValue);

    }

}

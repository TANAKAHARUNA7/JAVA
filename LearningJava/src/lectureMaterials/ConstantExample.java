package lectureMaterials;

public class ConstantExample {
    public static void main(String[] args) {
        // リテラル算数【Literal Constant】
        // '3.14159' はリテラル定数でそれ自体に値の意味を持つ
        double piLiteral = 3.14159;
        System.out.println("りてらる整数"+ piLiteral);

        // 一般算数【Named Constant】
        // 'final' キーワードを利用して定数宣言　以降値を変更することはできない
        final double PI = 3.14159;

        // Pi = 3.14; // エラー：　定数の値は変更できない

        System.out.println("一般定数 PI;" + PI);

        // リテラル定数のまた違う例（文字と文字列）
        char letter = 'A';  // 'A'は文字のリテラル定数
        String greeting = "Hello, World!"; // "Hello, World!"は文字列のリテラル定数

        System.out.println("文字リテラル定数：　" + letter);
        System.out.println("文字列リテラル定数：　" + greeting);

        // 一般定数（不変文字列）
        final String GREETING_MESSAGE = "Welcome to Java!";
        System.out.println("一般定数：　" + GREETING_MESSAGE);

        // 倫理リテラル定数
        boolean isJavaFun = true; // true は倫理のリテラル定数
        System.out.println("倫理リテラル定数：　" + isJavaFun);

    }


    public static class OverflowExample {
        public static void main(String[] args) {
            // int型　変数は32ビット整数形で、値の範囲は-2,147,483,648 ~ 2,147,483,647
            int maxInt = Integer.MAX_VALUE; // int型変数 maxInt に、int型の最大値を代入

            // 最大値に1を足すとオーバーフローが発生
            System.out.println("最大値: " + maxInt);
            maxInt += 1; // オーバーフロー発生
            System.out.println("オーバーフロート発生後の値: " + maxInt);

            // int型変数の最小値　-2,147,483,648
            int minInt = Integer.MIN_VALUE;  // int型変数 minInt に、int型の最小値を代入
            System.out.println("最小値: " + minInt);

            // 最小値に1を引くとアンダーフローが発生
            minInt -= 1;
            System.out.println("アンダーフローが発生: " + minInt);

            float maxFloat = Float.MAX_VALUE;
            System.out.println("実数最大値: " + maxFloat);

            //////////////////////////////////////////////////////

            byte bar = 127; // overflow
            bar++; // bar = bar + 1
            System.out.println(bar);

            bar = -128; // underflow
            bar--; // bar = -1
            System.out.println(bar);


            // long pos = 2147483647 + 2;  // -> オーバーフローがすでに発生した状態で代入しようとしているため
            //                                結果が -2147483647 となる

            long pos = 2147483647L + 2L;
            System.out.println(pos);


        }


    }
}

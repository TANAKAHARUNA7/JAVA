package SelfStudy;

public class J929 {
    public static void main(String[] args) {
        // 5と6と7を足した値に合計に8を掛けた値
        System.out.println((5 + 6 + 7) * 8);

        // 7と8を足した値を5で割った値に、6から4を引いた値に2を掛けた値を足す
        System.out.println(((7 + 8) /5 ) + ((6 -4 )* 2));

        // 1000を7で割ったあまり
        System.out.println(1000 % 7);

        //6を5で割った値をさらに２で割る
        System.out.println((6 / 5) / 2);

        // アルファベットAに32を足した文字
        char x = 'A';
        int y = (int)x + 32;
        char z = (char)y;
        System.out.println(z);


    }
}

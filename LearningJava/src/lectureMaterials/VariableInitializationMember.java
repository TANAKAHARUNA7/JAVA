package lectureMaterials;

public class VariableInitializationMember {
    int num; // 基本初期値　0
    boolean flag; // 基本初期値 false
    String text; // 基本初期値 null

    public static void main(String[] args) {
        VariableInitializationMember example = new VariableInitializationMember();

        System.out.println("整数初期値" + example.num); // 整数初期値0
        System.out.println("倫理初期値" + example.flag); // 倫理初期値false
        System.out.println("倫理初期値" + example.text); // 倫理初期値null

        example.num = 10;       // `num`に値10を設定
        example.flag = true;    // `flag`に値trueを設定
        example.text = "Hello"; // `text`に文字列"Hello"を設定

        System.out.println(example.num); //10
        System.out.println(example.flag); // true
        System.out.println(example.text); // Hello


    }
}




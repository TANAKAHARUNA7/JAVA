package SelfStudy;

class Pet{
    String name;
    int age;
    String type;

    static int count;
    static int totalAge;

    static { System.out.println("ペット管理システムを起動します。"); }

    { System.out.println("新しいペットを登録します。"); }


    // オーバーロードされたコンストラクタ（年齢省略）
    Pet(String name, String type){
        this(name, 0, type);
    }

    // 通常のコンストラクタ
    Pet(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
        count++;
        totalAge += age;
    }

    void introduce(){
        System.out.println("名前:" + name + "\n"
                        + "年齢:" + age + "才\n"
                        + "種類:" + type);
    }

    void introduce(boolean flag){
        if(flag){
            System.out.println("こんにちは！");
            introduce(); // 既存のメソッドを再利用
        }
    }

    // 統計表示
    static void showStatus(){
        int avg = totalAge / count;
        System.out.println("現在の登録数:" + count + "\n" + "平均年齢:" + avg );
    }
}

public class oopTest2 {
    public static void main(String[] args) {
        Pet pet1 = new Pet("ポチ", 3 , "犬");
        pet1.introduce(true);
        System.out.println(" ");

        Pet pet2 = new Pet("ミケ", "猫");
        pet2.introduce();
        System.out.println(" ");

        Pet.showStatus();
    }
}

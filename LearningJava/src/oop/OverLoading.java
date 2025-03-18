package oop;

// OverLoading
// 適用　→　[OOP : メソッド、　製造者],　[構造的言語:　関数]
// キーポイント
// -> 関数,　メソッド,　製造者から同一な名前を持つsub-routineが存在
class User {
    String id;
    String university;
    String department;

    User() {
        university = "ヨンジン専門大学";
    }

    User(String argDepartment) {
        this();
        department = argDepartment;
    }

    User(String argId, String argDepartment) {
        this();
        this.id = argId;
        this.department = argDepartment;
    }
}

    class Foo {
        String id;

        void prt() {
            System.out.println(this.id);
        }
    }

// オブジェクトを製造するとき初期化が必要なとき
public class OverLoading {
    public static void main(String[] args) {
        User user1 = new User();

        Foo f1 = new Foo();
    }
}


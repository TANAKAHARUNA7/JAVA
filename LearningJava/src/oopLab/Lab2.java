package oopLab;

class User{
    private String username;
    private String email;

    // コンストラクタから使用者情報を検証
    User(String username, String email){
        if (username.isEmpty() || email.isEmpty()){
            throw new IllegalArgumentException("使用者名とイーメイルは必須入力値です。");
        }
        this.username = username;
        this.email = email;
    }

    // 使用者情報出力


}


public class Lab2 {

}

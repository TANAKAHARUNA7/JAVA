package SelfStudy;

class Mail{
    String to;
    String subject;
    String body;

    Mail(String to, String subject, String body){
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    Mail(String to, String subject){
        this(to, subject, "(本文なし)");
    }

    Mail(String to){
        this(to, "（件名なし）", "（本文なし）");
    }

    void show(){
        System.out.println("宛先:" + to );
        System.out.println("件名:" + subject );
        System.out.println("本文:" + body + "\n") ;
    }

}
public class test {
    public static void main(String[] args) {
        Mail mail1 = new Mail("taro@example.com", "お知らせ", "こんにちは！");
        Mail mail2 = new Mail("jiro@example.com", "確認のお願い");
        Mail mail3 = new Mail("saburo@example.com");

        mail1.show();
        mail2.show();
        mail3.show();
    }
}

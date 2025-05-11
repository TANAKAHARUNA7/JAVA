package SelfStudy;

// インターフェイスclass
interface Englishable{
    String LANGUAGE = "[英語]";
    void display();
}

class Student7 implements Englishable{
    private String name;

    public Student7(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("名前" + name);
    }
    public void displayEnglish (){
        System.out.println(Englishable.LANGUAGE);
        System.out.println("NAME: " + name);
    }
}

class Baseball implements Englishable{
    public void display(){
        System.out.println("キャッチボール");
        System.out.println("シートノック");
        System.out.println("バッテイング");
    }
   public void displayEnglish() {
       System.out.println(Englishable.LANGUAGE);
       System.out.println("catch ball");
       System.out.println("seat knock");
       System.out.println("batting practice");
   }
}
public class interface_test {
    public static void main(String[] args) {
        Student7 stu = new Student7("Mark");
        stu.displayEnglish();

        Baseball b = new Baseball();
        b.displayEnglish();
    }
}

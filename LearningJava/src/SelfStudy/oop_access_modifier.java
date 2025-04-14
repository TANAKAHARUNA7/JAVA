package SelfStudy;

class Book{
    private String title;
    private int pages;

    public String getTitle(){
        return title;
    }
    public void setTitle(String argTitle){
        // .isEmpty() -> "中身が空っぽの文字列か？"どうか判断
        if(argTitle == null || argTitle.isEmpty()){
            return;
        }
        title = argTitle;
    }
    public int getPages(){
        return pages;
    }

}

public class oop_access_modifier {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("JAVA");
        System.out.println(b.getTitle());

        System.out.println(b.getPages());
    }
}

class Bar{
 void prtMsg(String msg , int n){
     System.out.println(2);
 }

 void prtMsg(int n){
     System.out.println(1);
    }

 void prtMsg(double n , String msg){
     System.out.println(2);
    }
}
public class test {
    public static void main(String[] args) {
    Bar bar = new Bar();

    bar.prtMsg("h",1);
    bar.prtMsg(5.5, "haha");
    bar.prtMsg(10);
    }
}

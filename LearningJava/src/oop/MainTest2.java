package oop;

class Scv {
    int numOfScv;
    int id;
    Scv(){
        id = ++numOfScv;
    }

    public String toString() {
        return "[Scvid=" + id + "]";
    }
}
class Util{
    float PT = 3.14f;
    static int add(int a, int b){ return (a+b); };
    static int avg(int a, int b){ return (a+b/ 2); };
}

public class MainTest2{
    public static void main(String[] args) {

        Scv s1 = new Scv();
        Scv s2 = new Scv();
        Scv s3 = new Scv();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(Util.add(1, 2)); // オブジェクトを作らないで関数みたいに使う時
    }
}
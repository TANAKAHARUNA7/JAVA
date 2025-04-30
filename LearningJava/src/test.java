class Bar {
    int myId;
    static int count;
    static int value;

    void setValue(int argValue) {
        value = argValue;
    }

    Bar() {
        myId = count++;
    }
}

public class test {
    public static void main(String[] args) {
        Bar bar1 = new Bar();
        Bar bar2 = new Bar();
        Bar bar3 = new Bar();

        bar3.setValue(10);

        System.out.println(bar1.myId + ":" + bar1.value);
        System.out.println(bar2.myId + ":" + bar2.value);
        System.out.println(bar3.myId + ":" + bar3.value);
    }
}

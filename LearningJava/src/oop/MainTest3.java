package oop;

class ItemBox {
    int numOfBoxes;

    void push()
        {numOfBoxes++;}
    void pop()
        {numOfBoxes--;}
}
class Foo2 {
    ItemBox box;
    Foo2(ItemBox argBox)
        { box = argBox;}
}
class Pos {
    ItemBox box;
    Pos(ItemBox argBox)
        {box = argBox;}
}
public class MainTest3 {
    public static void main(String[] args) {
        ItemBox box = new ItemBox();
        Foo2 foo = new Foo2(new ItemBox());
        Pos pos = new Pos(new ItemBox());
        foo.box.push();
        foo.box.push();
        pos.box.pop();
        pos.box.pop();
    }
}

package SelfStudy;

class Rectangle{
    int x, y, width, height;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    void draw(){
        System.out.printf("rectangle (%d,%d) size:(%d,%d)",x,y,width,height);
    }
}

public class Inheritance_test {
    public static void main(String[] args) {

    }
}

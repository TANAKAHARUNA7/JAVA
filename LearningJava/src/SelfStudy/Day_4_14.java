package SelfStudy;

class Figure{
    protected int x, y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    protected void header(String name){
        System.out.printf("%s (%d, %d)\n", name, x, y);
    }

    public void draw(){

    }
}

class Rectangle extends Figure{
    private int width, height;

    public Rectangle(int x, int y, int width, int height){
        super(x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(){
        super.header("rectangle");
        System.out.printf("size:%d*%d\n", width, height);
    }
}

class Circle  extends Figure{
    private int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }
    @Override
    public void draw(){
        super.header("circle");
        System.out.printf("radius: %d\n", radius);
    }
}
public class Day_4_14 {
    public static void main(String[] args) {
        Figure [] figure = {
                new Rectangle(100, 200, 11, 12),
                new Circle(300, 400, 34)
        };
        for (Figure f : figure){
            f.draw();
        }
    }
}

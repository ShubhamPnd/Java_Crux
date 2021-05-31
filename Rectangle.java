package Object_oriented_programming;


class Rect{
    int length;
    int breadth;
    public int area() {
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect rectangle = new Rect();
        rectangle.length = 4;
        rectangle.breadth = 3;
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}

package Object_oriented_programming;

class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.pow(radius , 2);
    }

    public double Volume() {
        return Math.PI * Math.pow(radius , 2) * height;
    }
}


class RectAngle {
    private int length;
    private int breadth;

    public RectAngle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class Access_Modifiers_and_Constructors {
    public static void main(String[] args) {
   Cylinder cyc  = new Cylinder(2,4);
        System.out.println(cyc.surfaceArea());
        System.out.println(cyc.Volume());
        RectAngle rect = new RectAngle(23,67);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
    }
}

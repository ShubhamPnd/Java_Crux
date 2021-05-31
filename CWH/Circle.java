package Object_oriented_programming;
class cir {
    double radius;
    public double area (){
        return Math.PI * Math.pow(radius,2);
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
public class Circle {
    public static void main(String[] args) {
        cir circ = new cir();
        circ.radius = 5;
        System.out.println(circ.area());
        System.out.println(circ.circumference());
    }
}

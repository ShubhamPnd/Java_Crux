package Object_oriented_programming;

class circ {
    public int radius;

    circ() {
        System.out.println("I am a default constructor");
    }

    circ(int r) {
        System.out.println("I am circle Parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cyc extends circ {
    public int height;

    cyc(int r , int h) {
        super(r);
        System.out.println("I am Cylinder parametrized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius*this.height;
    }

}


public class Practice_Questions_Inheritance {
    public static void main(String[] args) {
     circ c = new circ(11);
     cyc q = new cyc(12,32);
     System.out.println(c.area());
     System.out.println(q.volume());
    }
}

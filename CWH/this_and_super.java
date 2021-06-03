package Object_oriented_programming;

// Demonstrate this keyword
class This {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void display(){
        System.out.println("Hey Here is the demonstration of this keyword");
    }

    public This(int x) {
        this.x = x;
    }
}
// Demonstrate super
class xyz extends This {

    public xyz(int x) {
        super(x);
        System.out.println("I am a constructor" + x);
    }
}

public class this_and_super {
    public static void main(String[] args) {
    This t = new This(64);
    t.display();
        System.out.println(t.getX());
    xyz ss = new xyz(45);
    }
}

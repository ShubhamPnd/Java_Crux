package Object_oriented_programming;

class base {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void display() {
        System.out.println("Hello there I am the base class");
    }
    base() {
        System.out.println("I am a constructor");
    }
}

class derived extends base {
    // Derived class constructor directly call the default constructor of the base class
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("Hello There I am derived class inherited from base class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.display();
        derived d = new derived();
        d.setY(23);
        System.out.println(d.getY());
    }
}

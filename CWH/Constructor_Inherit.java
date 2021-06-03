package Object_oriented_programming;

class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x:" + x);
    }
}

class  Derived extends Base1{
    Derived(){
        super(0);
        System.out.println("I am a Derived class Constructor");
    }
    Derived(int x , int y) {
        super(x);
        System.out.println("I am an overloaded constructor of derived class with the value of y:" + y);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived class");
    }
    ChildOfDerived(int x, int y , int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived child class" + z);
    }
}

public class Constructor_Inherit {
    public static void main(String[] args) {
    Base1 b = new Base1();
    Derived d1 = new Derived();
    Derived d = new Derived(45,52);
    ChildOfDerived cd1 = new ChildOfDerived();
    ChildOfDerived cd = new ChildOfDerived(45,75,8);
    }
}

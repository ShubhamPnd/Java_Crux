package Object_oriented_programming;
class A {
    public void display(){
        System.out.println("hey there , I came from base class A");
    }
}
class B extends A {
    @Override
    public void display(){
        System.out.println("hey there , I came from Derived class B");
    }
}
public class Method_overRiding {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.display();
    }
}

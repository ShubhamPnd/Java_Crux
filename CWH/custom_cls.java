package Object_oriented_programming;

class Employee {
    int id;
    int salary;
    String name;
    public void printDetails() {
        System.out.println("My id is"+id);
        System.out.println("My Name is"+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class custom_cls {
    public static void main(String[] args) {
        System.out.println("This is custom class");
        Employee harry = new Employee(); // Instantiating a new Employee object
        Employee john = new Employee(); // Instantiating a new Employee object
        // Setting properties or say Attributes
        harry.id = 12;
        harry.name = "Shubham";
        harry.salary = 45;
        // Setting properties or say Attributes
        john.id = 13;
        john.name = "Saksham";
        john.salary = 98;
        // Printing Values
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();
        int salary = harry.salary;
        System.out.println(salary);
        john.printDetails();
        int salary2 = john.salary;
        System.out.println(salary2);
    }
}

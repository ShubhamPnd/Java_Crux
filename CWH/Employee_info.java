package Object_oriented_programming;

class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Employee_info {
    public static void main(String[] args) {
        Employee1 shubh = new Employee1();
        shubh.setName("Shubham Pandey"); // if we not set the values then it simply returns NULL
        System.out.println(shubh.getName());
        shubh.salary = 344;
        System.out.println(shubh.getSalary());

    }
}

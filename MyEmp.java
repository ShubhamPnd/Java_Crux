package Object_oriented_programming;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
public class MyEmp {
    public static void main(String[] args) {
        MyEmployee employee = new MyEmployee();
        employee.setName("Shivender");
        System.out.println(employee.getName());
        employee.setId(45);
        System.out.println(employee.getId());
    }
}

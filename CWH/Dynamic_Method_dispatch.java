package Object_oriented_programming;


class phone {
    public void showTime() {
        System.out.println("Time is 8am");
    }
    public void on () {
        System.out.println("Turning on PHONE");
    }
}

class SmartPhone extends phone {
    public void music() {
        System.out.println("Playing Music");
    }
    @Override
    public void on() {
        System.out.println("Turning on SmartPHONE");
    }
}

public class Dynamic_Method_dispatch {
    public static void main(String[] args) {
//        phone phn = new phone(); // Allowed
//        SmartPhone smphn = new SmartPhone(); // Allowed
        phone phn2 = new SmartPhone(); // Allowed
//        SmartPhone smphn2 = new  phone(); // Not Allowed
        phn2.showTime();
        phn2.on();
//        phn2.music(); -----> Not Allowed
    }
}

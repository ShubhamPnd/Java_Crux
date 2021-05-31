package Object_oriented_programming;

class Cell{
    public void ring(){
        System.out.println("Phone is Ringing");
    }
    public void vibrate(){
        System.out.println("phone is vibrating");
    }
    public void callFriend(){
        System.out.println("Call my friend Shivender");
    }
}

public class Cell_phn {
    public static void main(String[] args) {
        Cell realme = new Cell();
        realme.ring();
        realme.vibrate();
        realme.callFriend();
    }
}

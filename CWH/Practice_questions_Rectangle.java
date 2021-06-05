package Object_oriented_programming;


class Recta {
    public int length;
    public int breadth;

    public Recta(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area() {
        return this.breadth * this.length;
    }
}

class cuboid extends Recta {
  public int height;


  cuboid(int length , int breadth , int height) {
       super(length,breadth);
       this.height = height;
  }

  public double volume() {
      return this.length * this.breadth * this.height;
  }

}


public class Practice_questions_Rectangle {
    public static void main(String[] args) {
    Recta r = new Recta(22,65);
    cuboid cub = new cuboid(32,32,23);
        System.out.println(r.area());
        System.out.println(cub.volume());
    }
}

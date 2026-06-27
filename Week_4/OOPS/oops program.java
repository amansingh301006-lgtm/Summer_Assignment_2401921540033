interface Test {
    int square(int n);
}
class Arithmetic implements Test {

    @Override
    public int square(int n) {
        return n * n;
    }
}
import java.util.Scanner;

public class ToTestInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Arithmetic obj = new Arithmetic();

        System.out.println("Square = " + obj.square(num));
    }
}
class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {

        void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.display();

        Outer.Inner in = obj.new Inner();
        in.display();
    }
}
class Point {

    private int x;
    private int y;

    
    public Point() {
        x = 0;
        y = 0;
    }

    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

public class TestPoint {
    public static void main(String[] args) {

        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setXY(30, 40);
        p2.display();
    }
}
class Box {

    double length;
    double breadth;

    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}
class Box3D extends Box {

    double height;

    Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}
import java.util.Scanner;

public class TestBox {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        Box3D obj = new Box3D(l, b, h);

        System.out.println("Area = " + obj.area());
        System.out.println("Volume = " + obj.volume());
    }
}

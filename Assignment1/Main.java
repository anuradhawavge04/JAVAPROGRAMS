package Assignment1;

class Point {
 protected int x;
 protected int y;

 public Point() {
     this.x = 0;
     this.y = 0;
 }

 public Point(int x, int y) {
     this.x = x;
     this.y = y;
 }

 public void display() {
     System.out.println("Point: (" + x + ", " + y + ")");
 }
}

class ColorPoint extends Point {
 private String color;

 public ColorPoint() {
     super(); 
     this.color = "Black";
 }

 public ColorPoint(int x, int y, String color) {
     super(x, y); 
     this.color = color;
 }

 public void display() {
     System.out.println("ColorPoint: (" + x + ", " + y + "), Color: " + color);
 }
}

class Point3D extends Point{
 private int z;

 public Point3D() {
     super();
     this.z = 0;
 }

 public Point3D(int x, int y, int z) {
     super(x, y);
     this.z = z;
 }

 public void display() {
     System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");
 }
}
 
public class Main{
 public static void main(String[] args) {
   
     Point p1 = new Point();
     Point p2 = new Point(10, 20);

     ColorPoint cp = new ColorPoint(5, 15, "Red");

     Point3D p3d = new Point3D(3, 6, 9);

   
     p1.display();
     p2.display();
     cp.display();
     p3d.display();
 }
}


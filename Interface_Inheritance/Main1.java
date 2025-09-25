package Interface_Inheritance;

class Point{
	 protected int x,y;
	 
	 public Point() {
		 this.x=0;
		 this.y=0;
	 }
	 
	 public Point(int x,int y) {
		 this.x=x;
		 this.y=y;
	 }
	 
	 public void display() {
		 System.out.println("Coordinates:"+x+" "+y);
	 }
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		this.color=null;
	}
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	
	public void display() {
		System.out.println("Coordinates and color:"+x+" "+y+" "+color);
	}
}


class Point3D extends Point{
	private int z;
	
	public Point3D() {
		this.z=0;
	}
	
	public Point3D(int x,int y, int z) {
		super(x,y);
		this.z=z;
	}
	
    public void display() {
    	System.out.println(""+x+" "+y+" "+z);
    	
    }
}



public class Main1 {

	public static void main(String[] args) {
	Point p=new Point(20,30);
	p.display();
	
	ColorPoint cp=new ColorPoint(20,30,"yellow");
	cp.display();
	
	Point3D pd=new Point3D(20,30,40);
	pd.display();
	}

}

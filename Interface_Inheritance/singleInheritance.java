package Interface_Inheritance;

class Shape{
	int a=10,b=20;
}

class Rectangle extends Shape{
	public void rectArea() {
		System.out.println("Rectanglr area:"+(a*b));
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.rectArea();
	}

}

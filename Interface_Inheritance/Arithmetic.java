package Interface_Inheritance;

class baseclass{
	int a=10,b=20;
	public void add() {
		System.out.println("Sum"+(a+b));
	}
}

class Main extends baseclass{
	public void sub() {
		System.out.println("Difference"+(a-b));
	}
}
public class Arithmetic {

	public static void main(String[] args) {
		Main obj=new Main();
		obj.add();
		obj.sub();

	}

}

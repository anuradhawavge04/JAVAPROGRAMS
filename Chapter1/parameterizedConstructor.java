package Chapter1;

public class parameterizedConstructor {

	int a;
	int b;
	
	public parameterizedConstructor(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		int sum=a+b;
		System.out.println("Addition is:"+sum);
	}
	public static void main(String[] args) {
		

		parameterizedConstructor p= new parameterizedConstructor(10,20);
		p.display();
	}

}

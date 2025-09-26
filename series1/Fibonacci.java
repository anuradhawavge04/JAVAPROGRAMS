package series1;

public class Fibonacci {

	public Fibonacci(int n) {
		int a=0,b=1;
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++) {
			System.out.println(a+"");
			int next=a+b;
			a=b;
			b=next;
		}
		System.out.println();
	}

}

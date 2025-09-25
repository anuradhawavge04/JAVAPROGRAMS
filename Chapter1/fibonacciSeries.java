package Chapter1;

public class fibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,n=10;
		System.out.println(a+ " " +b);
		for(int i=2;i<=n;i++) {
			int sum=a+b;
			System.out.println(" "+sum);
			a=b;
			b=sum;
		}

	}

}

package Assignment2;

	import series1.CubeSeries;
	import series1.SquareSeries;
	import series1.Fibonacci;

	import java.util.*;

	public class Series {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter number of terms(n):");
			int n=sc.nextInt();
			
			new Fibonacci(n);
			new CubeSeries(n);
			new SquareSeries(n);

		}
}

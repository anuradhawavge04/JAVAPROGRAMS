package Chapter1;

import java.util.*;
public class factorial1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
			System.out.println("Factorial is:"+factorial);
		}
	}

}

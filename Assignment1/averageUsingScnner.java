package Assignment1;

import java.util.*;
public class averageUsingScnner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int count=sc.nextInt();
		
		
		if(count<=0) {
			System.out.println("Please enter positive number:");
			return;
		}
		
		double sum=0;
		
		
		for(int i=0;i<=count;i++) {
			System.out.println("Enter number:"+i+":");
			double number=sc.nextDouble();
			sum+=number;
			
		}
		
		double average=sum/count;
		System.out.println("The average is:"+average);

	}

}

package Chapter1;

import java.util.*;
public class cgpaCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject1:");
		int sub1=sc.nextInt();
		System.out.println("Enter marks of second subject:");
		int sub2=sc.nextInt();
		System.out.println("Enter marks of third subject:");
		int sub3=sc.nextInt();
		System.out.println("Enter marks of fourth subject:");
		int sub4=sc.nextInt();
		float cgpa_calculation=((sub1+sub2+sub3+sub4)/4);
		System.out.println("CGPA :"+cgpa_calculation);
		
	}

}

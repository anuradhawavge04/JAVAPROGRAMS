package Assignment1;

//length*breadth

import java.util.*;
public class areaOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length:");
		float l=sc.nextFloat();
		
		System.out.println("Enter breadth:");
		float b=sc.nextFloat();
		
		float areaOfR=l*b;
		
		System.out.println("Area of rectangle is:"+areaOfR);
	}

}

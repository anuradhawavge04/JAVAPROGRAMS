package PrcacticeSet;

//0.5*base*height

import java.util.*;
public class areaOfTriangle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in) ;
	System.out.println("Enter base:");
	float b=sc.nextFloat();
	System.out.println("Enter height:");
	float h=sc.nextFloat();
	
	float area=0.5f*b*h;
	
	System.out.println("Area of triangle is:"+area);
	
	}

}

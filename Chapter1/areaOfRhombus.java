package Chapter1;

//base*height

import java.util.*;
public class areaOfRhombus {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter base:");
	float b=sc.nextFloat();
	
	System.out.println("Enter height:");
	float h=sc.nextFloat();
	
	float area=b*h;
	System.out.println("Area of Rhombus is:"+area);
	}

}

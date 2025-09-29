package PrcacticeSet;
//3.14*r*r

import java.util.*;
public class areaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		
		float area=3.14f*r*r;
		
		System.out.println("Area of circle is:"+area);

	}

}

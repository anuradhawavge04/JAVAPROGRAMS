package PrcacticeSet;
//2*3.14*r(r+h)

import java.util.*;
public class totalSurfaceAreaOfCylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		System.out.println("Enter height:");
		float h=sc.nextFloat();
		
		float totalArea=2*3.14f*r*(r+h);
		System.out.println("Total surface area of cylinder is:"+totalArea);

	}

}

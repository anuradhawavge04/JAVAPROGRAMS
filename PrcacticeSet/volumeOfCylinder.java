package PrcacticeSet;
//3.14*r*r*h

import java.util.*;
public class volumeOfCylinder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		
		System.out.println("Enter heighht:");
		float h=sc.nextFloat();
		
		float volume=3.14f*r*r*h;
		
		System.out.println("Volume of cylinder is:"+volume);
	}

}

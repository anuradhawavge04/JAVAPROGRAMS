package Chapter1;
//4*l*l

import java.util.*;
public class curvedSurfaceAreaOfCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		float l=sc.nextFloat();
		
		float area=4*l*l;
		System.out.println("Curved surface area of cube is:"+area);

	}

}

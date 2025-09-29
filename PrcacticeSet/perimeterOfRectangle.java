package PrcacticeSet;

//2*(length+width)

import java.util.*;
public class perimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length:");
		float l=sc.nextFloat();
		
		System.out.println("Enter width:");
		float w=sc.nextFloat();
		
		float perimeter=2*(l+w);
		
		System.out.println("Perimeter of recatngle is:"+perimeter);
	}

}

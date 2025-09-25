package Chapter1;

//4*side

import java.util.*;
public class perimeterOfSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter side:");
		float s=sc.nextFloat();
		
		float perimeter=4*s;
		System.out.println("Perimeter of Square is:"+perimeter);
		

	}

}

package PrcacticeSet;
//2*base*side

import java.util.*;
public class perimeterOfParallelogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base:");
		float b=sc.nextFloat();
		
		System.out.println("Enter side:");
		float s=sc.nextFloat();
		
		float perimeter=2*b*s;
		
		System.out.println("Peremeter of parallelogram is:"+perimeter);
	}

}

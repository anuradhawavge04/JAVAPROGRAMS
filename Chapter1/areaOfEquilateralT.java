package Chapter1;
// area = (Math.sqrt(3) / 4) * side * side;

import java.util.*;
public class areaOfEquilateralT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter side:");
		double s=sc.nextDouble();
		
		double area=(Math.sqrt(3)/4)*s*s;
		System.out.println("Area of Equilateral Tringle is:"+area);
	}

}

package Chapter1;

//4/3*3.14*r*r

import java.util.*;
public class volumeOfSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		
		float volume=((4/3)*3.14f*r*r);
		System.out.println("Volume of sphere is:"+volume);
	}
	

}

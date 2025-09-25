package Chapter1;

//v=b*h

import java.util.*;
public class volumeOFPrism {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base:");
		float b=sc.nextFloat();
		System.out.println("Enter height:");
		float h=sc.nextFloat();
		
		float volume=b*h;
		System.out.println("Volume of prism is:"+volume);

	}

}

package Chapter1;
//(1/3)*3.14*r*r*h
import java.util.*;
public class volumeOfCone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		
		System.out.println("Enter height:");
		float h=sc.nextFloat();
		
		float volume=0.33f*3.14f*r*h;
		
		System.out.println("Volume of cone is:"+volume);
	
	}

}

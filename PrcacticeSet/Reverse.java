package PrcacticeSet;

import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter number:");
		int input = sc.nextInt();
		int reversed=0;
		while(input>0) {
			int digit=input%10;
			reversed=reversed*10+digit;
			input/=10;
		}
		System.out.println("Reversed no:"+reversed);

	}

}

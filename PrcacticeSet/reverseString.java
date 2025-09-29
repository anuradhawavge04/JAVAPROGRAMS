package PrcacticeSet;

import java.util.*;
public class reverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter String:");
	String input=sc.nextLine();
	 
	String reversed=sc.nextLine();
	for(int i=input.length()-1;i>=0;i--) {
		reversed+=input.charAt(i);
	}
	System.out.println("Reversed String:"+reversed);

	}

}
                                                                                   
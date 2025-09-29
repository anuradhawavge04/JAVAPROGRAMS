package PrcacticeSet;

import java.util.*;
public class battingAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total number of runs:");
		float runs=sc.nextFloat();
		
		System.out.println("Enter how many times batter has dismissed:");
		float dismiss=sc.nextFloat();
	
		float batting_Avg=runs/dismiss;
		System.out.println("Batting average is:"+batting_Avg);
	}
		

}

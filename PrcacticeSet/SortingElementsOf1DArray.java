package PrcacticeSet;

import java.util.Arrays;
import java.util.*;
public class SortingElementsOf1DArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n=sc.nextInt();
	int []a=new int[n];
	System.out.println("Enter elements of array:");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Sorted Array:");
	Arrays.sort(a);
	

	}

}

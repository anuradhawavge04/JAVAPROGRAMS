package Assignment1;

import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number of rows:");
	int rows=sc.nextInt();
	
	System.out.println("Enter number of columns:");
	int column=sc.nextInt();
	
	int [][]arr=new int[rows][column];
    
	System.out.println("Enter elements of the array:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			System.out.println("Element at ["+i+"]["+j+"]:");
			arr[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("2D array is:");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<column;j++) {
			System.out.print(arr[i][j]+"");
		}
		System.out.println("");
	}

	}

}

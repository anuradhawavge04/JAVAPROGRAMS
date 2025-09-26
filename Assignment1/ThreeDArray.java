package Assignment1;

import java.util.*;
public class ThreeDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int row=sc.nextInt();
		
		System.out.println("Enter number of columns:");
		int col=sc.nextInt();
		
		System.out.println("Enter how many matrix you want to print:");
		int num=sc.nextInt();
		
		int [][][]arr=new int[num][row][col];
		
		System.out.println("Enter the elements of 3D Array:");
		for(int n=0;n<num;n++) {
			System.out.println("Matrix:"+n+1+":");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
				
					arr[n][i][j]=sc.nextInt();
				}
				
			}
			
		}
		
		 System.out.println("\nThe 3D array is:");
	        for (int n = 0; n <num; n++) {
	            System.out.println("Matrix " + (n + 1) + ":");
	            for (int i = 0; i < row; i++) {
	                for (int j = 0; j < col; j++) {
	                    System.out.print(arr[n][i][j] + " ");
	                }
	                System.out.println(); 
	            }
	            System.out.println(); 
	        }


	}

}

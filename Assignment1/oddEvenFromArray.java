package Assignment1;

import java.util.Scanner;
public class oddEvenFromArray {


    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Create array to hold 5 numbers
	        int[] numbers = new int[5];

	        // Read 5 numbers from the user
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        // Print even numbers
	        System.out.print("Even numbers: ");
	        for (int i = 0; i < 5; i++) {
	            if (numbers[i] % 2 == 0) {
	                System.out.print(numbers[i] + " ");
	            }
	        }

	        System.out.println();

	        // Print odd numbers
	        System.out.print("Odd numbers: ");
	        for (int i = 0; i < 5; i++) {
	            if (numbers[i] % 2 != 0) {
	                System.out.print(numbers[i] + " ");
	            }
	        }

	        sc.close();
	    }
	}


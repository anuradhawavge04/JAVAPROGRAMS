package Assignment3;

//3. Write a java program to accept a number from the user, if number is zero then throw user defined exception ―Number is 0, otherwise check whether no is prime or not.

import java.util.*;
public class ZeroNumberException extends Exception {

	public ZeroNumberException(String message) {
		super(message);
	}
}

 class PrimeChecker{
	public static boolean isPrime	(int number) {
		if(number<=1)return false;	
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) 
			return false;
		}
		
		return true;
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter number:");
			int number=sc.nextInt();
			
			if(number==0) {
					throw new ZeroNumberException("Number is zero");
			}
			
			if(isPrime(number)) {
				System.out.println(number+"is a prime number");
			}
			
			else {
				System.out.println(number+"is not a prime number");
			}
		}
		
		catch(ZeroNumberException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Invalid Input.Please Enter an integer:");
		}
	}
}

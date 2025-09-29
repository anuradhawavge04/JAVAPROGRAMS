package PrcacticeSet;

import java.util.*;
public class operatorsUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		
		
	
		switch(ch){
		
		case 1:
			int sum=num1+num2;
			System.out.println("Addition of num1 and num2 is:"+sum);
			break;
			
		case 2:
			int sub=num1-num2;
			System.out.println("Substraction of num1 and num2 is:"+sub);
			break;
			
			
		case 3:
			int multi=num1*num2;
			System.out.println("Multiplication of two number is:"+multi);
			break;
			
		case 4:
			float div=num1/num2;
			System.out.println("Division of num1 and num2 is:"+div);
			break;
			
			
		case 5:
			float mod=num1%num2;
			System.out.println("Mod of num1 and num2 is:"+  mod);
			break;
			
			default:
				System.out.println("Invalid choice");
		}
	}

}

package PrcacticeSet;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int input=sc.nextInt();
		int original=input;
		int reversed=0;
		while(input>0) {
			int digit=input%10;
			reversed=reversed*10+digit;
			input/=10;
			
		}
		if(original==reversed) {
			System.out.println(original+ "is a palindeome");
			
		}
		else {
			System.out.println(original+ "is not palindrome");
		}

	}

}

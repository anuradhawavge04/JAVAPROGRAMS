package Assignment3;

	import java.util.*;
	public class SortedUniqueIntegers {
		
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			Set<Integer>numbers=new TreeSet<>();
			
			System.out.println("Enter how many numbers you want to input:");
			int n=sc.nextInt();
			
			
			System.out.println("Enter"+n+"integers:");
			for(int i=0;i<n;i++) {
				int num=sc.nextInt();
				numbers.add(num);
			}
			
			System.out.println("\nEnter a number to search:");
			int searchNum=sc.nextInt();
			
			
			if(numbers.contains(searchNum)) {
				System.out.println(searchNum+"is found in a collection");
				
			}
			
			else {
				System.out.println(searchNum+"is not found in a colloction");
			}
			
			
		}

	}


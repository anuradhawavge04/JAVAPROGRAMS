package PrcacticeSet;

public class foreach {

	public static void main(String[] args) {
		int[]myList= {11,12,13,14,15};
		int sum=0;
		for(int val:myList) {
			sum+=val;
			System.out.println("Sum of array element is:"+sum);
		}

	}

}

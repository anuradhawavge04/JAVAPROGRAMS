package Chapter1;

public class reverseString1 {

	public static void main(String[] args) {
		String str="Hello";
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		
		System.out.println("Original string:"+str);
		System.out.println("Reversed String is:"+reversed);
		
	}

}

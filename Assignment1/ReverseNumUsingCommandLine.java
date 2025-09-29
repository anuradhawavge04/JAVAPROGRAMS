package Assignment1;

public class ReverseNumUsingCommandLine {

		public static void main(String[] args) {
			int num;
			num=Integer.parseInt(args[0]);
			int rev=0;
			while(num>0) {
				int digit=num%10;
				rev=rev*10+digit;
				num/=10;
			}
			System.out.println("Reversed number:"+rev);

		}

	}



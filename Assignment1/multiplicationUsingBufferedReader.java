package Assignment1;

import java.io.*;
public class multiplicationUsingBufferedReader {


			public static void main(String[] args)  throws IOException {
				int num;
				int mult;
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter number:");
				num=Integer.parseInt(br.readLine());
				for(int i=1;i<=10;i++) {
					mult=i*num;
					System.out.println("Multiplication is:"+mult);
				}
				

			}

}

package Chapter1;

import java.io.*;
public class bufferReader {

	public static void main(String[] args) throws IOException{
		
		int rollNumber;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll no:");
		rollNumber=Integer.parseInt(br.readLine());
		System.out.println("Enter the name:");
		name=br.readLine();
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name:"+name);
	}

}

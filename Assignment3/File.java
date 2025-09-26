//4. Write a java program that displays the number of characters, lines and words of a file. 


package Assignment3;
import java.io.*;
import java.util.*;

public class File {

	public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the file path:");
			String filepath=sc.nextLine();
			
			int charCount=0;
			int wordCount=0;
			int lineCount=0;
			
			try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Dell\\Downloads\\All Homework Problem Sets-20241116T141832Z-001.zip\\All Homework Problem Sets.pdf"))){
				String line;
				
				while((line=reader.readLine())!=null) {
					lineCount++;	
					
					charCount+=line.length();
					
					String [] words=line.trim().split("\\s+");
					
					
					if(!line.trim().isEmpty()) {
						wordCount+=words.length;
					}
				}
				
				
				System.out.println("\n File Statistics:");
				System.out.println("\n Lines:         "+lineCount);
				System.out.println("\n Words:         "+wordCount);
				System.out.println("\n Characters:     "+charCount);
				
				
				
	
			}
			
			
			catch(FileNotFoundException e) {
				System.out.println("C:\\Users\\Dell\\Downloads\\All Homework Problem Sets-20241116T141832Z-001.zip\\All Homework Problem Sets.pdf");
			}
			
			
			catch(IOException e)
			{
				System.out.println("Error reading the file");
			}
	}
	
}

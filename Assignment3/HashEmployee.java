//2. Create a Hash table containing Employee name and Salary. Display the details of the hash 
table. Also search for a specific Employee and display Salary of that Employee. 

package Assignment3;

import java.util.*;

public class HashEmployee {

	
	public static void main(String[]args) {
		HashMap<String,Double> employeeTable=new HashMap<>();
		
		
		employeeTable.put("ABC",560000.0);
		employeeTable.put("BGC",760000.0);
		employeeTable.put("XYZ",860000.0);
		employeeTable.put("OPA",500000.0);
		employeeTable.put("AOP",900000.0);
		
		
		System.out.println("Employee Details:");
		for(Map.Entry<String,Double> entry:employeeTable.entrySet())
		System.out.println("Name:"+entry.getKey()+",Salary:$"+entry.getValue());
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name to search:");
		String searchName=sc.nextLine();
		
		
		if(employeeTable.containsKey(searchName)) {
			System.out.println("Salary of"+searchName+":$"+employeeTable.get(searchName));
		}
		
		else {
			System.out.println("Employee:"+searchName+"not found");
		}
	}
}


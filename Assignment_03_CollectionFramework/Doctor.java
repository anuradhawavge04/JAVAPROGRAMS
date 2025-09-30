//2. Write a java program to accept Doctor Name from the user and check whether it is valid 
//or not. (It should not contain digits and special symbol) If it is not valid then throw user 
//defined Exception - Name is Invalid -- otherwise display it.


package Assignment3;
import java.util.*;

class InvalidNameException extends Exception{
	public InvalidNameException(String message) {
		super(message);
	}
}


public class Doctor {

	public static void validateDoctorName(String name) throws InvalidNameException{
		if(!name.matches("[a-zA-Z]+")) {
			throw new InvalidNameException("Name is Invalid-It should not contain digits or special characters.");
		}
	}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctors name:");
		String DoctorName=sc.nextLine();
		
		try {
			validateDoctorName(DoctorName);
			System.out.println("Valid Doctor Name:"+DoctorName);
		}
		
		catch(InvalidNameException e) {
			System.out.println("Exception:"	+e.getMessage());
		}
	}
}

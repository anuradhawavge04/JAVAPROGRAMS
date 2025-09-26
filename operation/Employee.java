package operation;

import java.util.*;
abstract class Staff{
	protected String name;
	protected String address;
	
	
	public Staff(String name,String address) {
		this.name;
		this.address;
	}
	
	public abstract double calculateSalary;
	public abstract void display();
	
}


class FullTimeEmployee extends Staff{

	protected String dept;
	protected double sal;
	protected double hra;
	protected double da;
	
	public FullTimeEmployee(String name,String address,String dept,double sal) {
		super(name,address);
		this.dept=dept;
		this.sal=sal;
		this.hra=0.08*sal;
		this.da=0.05*sal;	
	}
	
	public double calculateSalary() {
		return sal+hra+da;
	}
	
	public void display() {
		System.out.println("\n Full Time Staff:");
		System.out.println("Name:"+name);
		System.out.println("Address"+address);
		System.out.println("Department:"+dept);
		System.out.println("Basic Salary:"+sal);
		System.out.println("HRA(%8):"+hra);
		System.out.println("DA(%5):"+da);
		System.out.println("Total salary:"+calculateSalary());
	}
}


class PartTimeEmployee extends Staff{
	private int numberOfHours;
	private double ratePerHour;
	
	public PartTimeEmployee(String name,String address,int numberOfHours,double ratePerHour) {
		super(name,address);
		this.numberOfHours;
		this.ratePerHour;
	}
	
	
	public double calculateSalary	() {
		return numberOfHours*ratePerHour;
	}
	
	public void display() {
		System.out.println("\n Part Time Staff:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Hours worked:"+numberOfHours);
		System.out.println("Rate per hour:"+ratePerHour);
		System.out.println("Total Salary:"+calculateSalary());
		
	}
}


class Employee {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the staff number:");
		int n=sc.nextInt();
		sc.nextLine();
		
		Staff[]	StaffList=new Staff[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("\nEnter details of staff:"+(i+1));
			System.out.println("Is this is Full Time(F) or Part Time(p)?");
		}	
	}
}


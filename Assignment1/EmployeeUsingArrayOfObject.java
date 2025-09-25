package Assignment1;

import java.util.*;
public class EmployeeUsingArrayOfObject {
;

	
	 String name;
	 float sal;
	 
	 Scanner sc=new Scanner(System.in);
	 public void put() {
		 System.out.println("Enter the name:");
		 name=sc.nextLine();
		 System.out.println("Enter the salary:");
		 sal=sc.nextFloat();
	 }
	 
	 public void get() {
		 System.out.println("The name is:"+name);
		 System.out.println("The salary is:"+sal);
	 }
	 
	 
		
		public static void main(String[] args) {
		
			EmployeeUsingArrayOfObject []e=new EmployeeUsingArrayOfObject [5];
			
			for(int i=0;i<5;i++) {
				e[i]=new EmployeeUsingArrayOfObject ();
				System.out.println("Enter the details of the employee:"+i+1);
				e[i].put();
			}
			
			for(int i=0;i<5;i++) {
				System.out.println("The details of the employee is:"+(i+1));
				e[i].get();
			}
		}

	}



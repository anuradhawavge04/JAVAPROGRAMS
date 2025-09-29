package Assignment2;
import java.util.Scanner;

	class Employee {
	    protected int id;
	    protected String name;
	    protected float sal;

	    public Employee() {
	        this.id = 0;
	        this.name = "";
	        this.sal = 0;
	    }

	    public void acceptInfo(Scanner sc) {
	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Salary: ");
	        sal = sc.nextFloat();
	    }

	    public void displayInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + sal);
	    }
	}

	class Manager extends Employee {
	    private int bonus;

	    public Manager() {
	        super();
	        this.bonus = 0;
	    }

	    public void acceptInfo(Scanner sc) {
	        super.acceptInfo(sc);
	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextInt();
	    }

	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + getTotalSalary());
	    }

	    public double getTotalSalary() {
	        return sal + bonus;
	    }
	}


	public class EmployeeInfo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of managers: ");
	        int n = sc.nextInt();

	        Manager[] managers = new Manager[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Manager " + (i + 1));
	            managers[i] = new Manager();
	            managers[i].acceptInfo(sc);
	        }

	        int maxIndex = 0;
	        double maxSalary = managers[0].getTotalSalary();

	        for (int i = 1; i < n; i++) {
	            double totalSalary = managers[i].getTotalSalary();
	            if (totalSalary > maxSalary) {
	                maxSalary = totalSalary;
	                maxIndex = i;
	            }
	        }

	        System.out.println("\nManager with Maximum Total Salary:");
	        managers[maxIndex].displayInfo();

	    }
	}

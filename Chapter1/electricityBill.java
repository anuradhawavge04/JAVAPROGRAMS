package Chapter1;
import java.util.*;
public class electricityBill {

	public static void main(String[] args) {
		//meter rent=50
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter current meter reading(kWh):");
	 int cr=sc.nextInt();
	 
	 System.out.println("Enter Previous meter reading(kWh):");
	 int pr=sc.nextInt();
	 
	 int total_meter_reading=cr-pr;
	 System.out.println("Total units are:"+total_meter_reading);
	 
	 System.out.println("Enter rate per kWh:");
	 int rate=sc.nextInt();
	 
	int TotalBill=total_meter_reading*rate+50;

	System.out.println("Total amount of your bill is:"+TotalBill);
	}

}

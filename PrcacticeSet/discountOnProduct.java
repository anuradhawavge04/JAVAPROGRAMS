package PrcacticeSet;

import java.util.*;
public class discountOnProduct {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Original price of product:");
	float original_price=sc.nextFloat();
	System.out.println("Enter how much discount is given on product: ");
	float dis=sc.nextFloat();
	
	float final_Price=((original_price*dis)/100);
	
	System.out.println("Discount amount is:"+final_Price);
			
	float final_dis_amount=original_price-final_Price;
	System.out.println("Final amount is:"+final_dis_amount);
	}

}

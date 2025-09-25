package Assignment1;


public class MyNumber {

	private int number;
	 MyNumber(){
		 this.number=0;
	 }
	 
	 MyNumber(int number){
		 this.number=number;
	 }
	 
	 public void isNegative() {
		 if(number<0) {
			 System.out.println(this.number+""+"is negative number");
		 }
	 }
	 
	 public void isPositive() {
		 if(number>0) {
			 System.out.println(this.number+""+"is positive number");
		 }
	 }
	 
	 
	 public void isOdd() {
		 if(number%2!=0) {
			 System.out.println(this.number+""+"is odd number");
		 }
	 }
	 
	 public void isEven() {
		 if(number%2==0) {
			 System.out.println(this.number+""+"is even number");
		 }
	 }
	public static void main(String[] args) {
		

		int num=Integer.parseInt(args[0]);
		MyNumber n=new MyNumber(num);
		MyNumber m=new MyNumber(22);
		
		m.isNegative();
		m.isPositive();
		m.isOdd();
		m.isEven();
		
		n.isNegative();
		n.isPositive();
		n.isOdd();
		n.isEven();
		
	}

}



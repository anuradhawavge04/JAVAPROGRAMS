package PrcacticeSet;


public class Account {

	int accno;
	String accname;
	int bal;
	
	public void display() {
		Account a[]=new Account[5];
		a[0]=new Account();
		a[1]=new Account();
		a[2]=new Account();
		a[3]=new Account();
		a[4]=new Account();
		
		a[0].accno=1;
		a[0].accname="abc";
		a[0].bal=60000;
		
		a[1].accno=2;
		a[1].accname="mkl";
		a[1].bal=80000;
		
		a[2].accno=3;
		a[2].accname="jkl";
		a[2].bal=100000;
		
		a[3].accno=4;
		a[3].accname="opq";
		a[3].bal=900000;
		
		a[4].accno=5;
		a[4].accname="iop";
		a[4].bal=160000;
		
		
		
	}
	

	public static void main(String[] args) {
		Account a=new Account();		
	}

}

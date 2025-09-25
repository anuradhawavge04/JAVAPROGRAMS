package Assignment1;

public class MyDate {


		int DD,MM,YY;
		
		public MyDate() {
			System.out.println("I am default constructor");
		} 
		
		public MyDate(int dd,int mm,int yy) {
			this.DD=dd;
			this.MM=mm;
			this.YY=yy;
		}
		public void Date() {
			System.out.println("Date :"+this.DD+"-"+this.MM+"-"+this.YY);
		}
		public static void main(String[] args) {
			MyDate D=new MyDate();
			MyDate D2=new MyDate(02,05,24);
			D2.Date();
		}

	}


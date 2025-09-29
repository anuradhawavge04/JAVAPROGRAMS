package Assingment2;


public class StudentInfo {

		String name;
		int rollNo;
		String phno;
		String emailId;
		
		final static String clgName="BJS Collage";
		
		private StudentInfo(String name,int rollno,String phno,String emailId) {
			this.name=name;
			this.rollNo=rollno;
			this.phno=phno;
			this.emailId=emailId;
		}
		
		public void displayInfo() {
			System.out.println("******************************************************");
			System.out.println("Student Name:"+this.name);
			System.out.println("Student RollNo:"+this.rollNo);
			System.out.println("Student Phno:"+this.phno);
			System.out.println("Student emailId:"+this.emailId);
			System.out.println("******************************************************");
			
		}
		
		public static void main(String[] args) {
			StudentInfo s=new StudentInfo("ABC",23,"3445233445","a.e11@gmail.com");

			s.displayInfo();
		}

	}


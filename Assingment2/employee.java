package Assingment2;

class fullTimeEmp extends employee{
		void salary() {
			System.out.println("Salary of employee is:90000");
		}
	}

	class partTimeEmp extends employee{
		void salary() {
			System.out.println("Salary of part time employee:40000");
		}
	}



	public class employee {

		void salary() {
			String empId="1";
			String empName="ABC";
			
			System.out.println("Emp Id:"+empId);
			System.out.println("Emp Name:"+empName);
		}
		public static void main(String[] args) {
		
			employee e;
			e=new employee();
			e.salary();
			e=new fullTimeEmp();
			e=new partTimeEmp();
			e.salary();
		}

	}



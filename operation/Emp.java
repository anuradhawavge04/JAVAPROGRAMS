package operation;
class Emp {

		protected String name;
	    protected float sal;
		
		public Emp(String name,float sal) {
			this.name=name;
			this.sal=sal;
		}
		
		public void display() {
			System.out.println("Employee name:"+name);
			System.out.println("Employee Salary:"+sal);
		}
	}

	class Developer extends Emp{
		protected String projectName;
		
		public Developer(String name,float sal,String projectName) {
			super(name,sal);
			this.projectName=projectName;
		}
		
		public void display() {
			super.display();
			System.out.println("Project Name:"+projectName);
		}
	}

	class Programmer extends Developer{
		protected String progLanguage;
		
		public Programmer(String name,float sal,String projectName,String progLanguage) {
			super(name,sal,projectName);
			this.progLanguage=progLanguage;
		}
		
		public void display() {
			super.display();
			System.out.println("Programming Language:"+progLanguage);
		}
	}


	class MultipleInheritance{
		public static void main(String[] args) {
			Developer dev=new Developer("A",400000,"ABC");
			dev.display();
		}
	}

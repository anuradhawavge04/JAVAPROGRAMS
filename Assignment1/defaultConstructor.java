package Assignment1;

public class defaultConstructor {
	int id;
	String name;
	public defaultConstructor() {}
	public void display() {
		System.out.println(id+ " " +name);
	}


	public static void main(String[] args) {
		
		defaultConstructor d=new defaultConstructor();
		d.display();
	}

}

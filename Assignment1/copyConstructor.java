package Assignment1;

public class copyConstructor {
	int id;
	String name;

	public copyConstructor(int i,String n) {
		id=i;
		name=n;
	}
	
	copyConstructor(copyConstructor c){
		id=c.id;
		name=c.name;
	}
	
	void display() {
		System.out.println(id+ " " +name);
	}
	public static void main(String[] args) {
		copyConstructor c1=new copyConstructor(101,"karan");
		copyConstructor c2=new copyConstructor(c1);
		c1.display();
		c2.display();

	}

}

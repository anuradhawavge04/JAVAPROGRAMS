package series1;
import Utility.CapitalString;

    public class Person {
	    private String name;
	    private String city;

	    public Person(String name, String city) {
	        this.name = name;
	        this.city = city;
	    }

	    public void display() {
	        CapitalString capitalizer = new CapitalString();
	        String capitalizedName = capitalizer.capitalizeFirstLetter(name);
	        System.out.println("Name: " + capitalizedName);
	        System.out.println("City: " + city);
	    }

	    public static void main(String[] args) {
	        Person p = new Person("john", "new york");
	        p.display();
	    }
	}



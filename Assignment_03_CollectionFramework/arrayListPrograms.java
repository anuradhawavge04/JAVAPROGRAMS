package Assignment_03_CollectionFramework;


	import java.util.*;
	public class arrayListPrograms {

		public static void main(String[]args) {
			ArrayList<String> arraylist=new ArrayList<>();
			arraylist.add("Item 3");
			arraylist.add("Item 4");
			arraylist.add("Item 5");
			arraylist.add("Item 6");
			arraylist.add("Item 0");
			arraylist.add("Item 2");
			arraylist.add(1,"Item 1");
			System.out.println("\n Using the add method\n");
			System.out.println(arraylist);
			
			arraylist.remove("Item 5");
			System.out.println(arraylist);
			System.out.println("\nUsing the Iterator interface");
			String s;
			Iterator e=arraylist.iterator();
			while(e.hasNext()) {
				s=(String)e.next();
				System.out.println(s);
			}
		}
	}


package Assignment_03_CollectionFramework;



	import java.util.*;
	public class LinkedHashSetPrograms{

		public static void main(String[]args) {
			LinkedHashSet<String> ls=new LinkedHashSet<String>();
			
			ls.add("Cafe Latte...");
			ls.add("Expresso....");
			ls.add("Cafe Borgis...");
			
			Iterator<String> i=ls.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}


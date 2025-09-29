package Assignment_03_CollectionFramework;


	import java.util.*;
	public class HashTablePrograms {

		public static void main(String[]args) {
			Hashtable hashtable1=new Hashtable();
			
			hashtable1.put("Item 0","value 0" );
			hashtable1.put("Item 1","value 1" );
			hashtable1.put("Item 2","value 2" );
			hashtable1.put("Item 3","value 3" );
			hashtable1.put("Item 4","value 4" );
			hashtable1.put("Item 5","value 5" );
			hashtable1.put("Item 6","value 6" );
			
			Enumeration keys=hashtable1.keys();
			
			while(keys.hasMoreElements()) {
				String key=(String) keys.nextElement();
				System.out.println(key+" /"+hashtable1.get(key));
			}
		}
	

}

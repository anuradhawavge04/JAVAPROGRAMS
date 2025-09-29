package Assignment_03_CollectionFramework;


	import java.util.*;
	import java.util.Map;
	public class LinkedHashMapPrograms {

		 LinkedHashMapPrograms(){
			 System.out.println("\n Linked Hashmap");
		 }
		
		public static void main(String[] args) {
			LinkedHashMap<Integer,String>
			l=new LinkedHashMap<Integer,String>();
			l.put(1001,"Om");
			l.put(1002,"Alisha");
			l.put(1003,"Advik");
			for(Map.Entry k:l.entrySet()) {
				System.out.println(k.getKey()+" "+k.getValue());
			}
			

		}

	}

package Assignment_03_CollectionFramework;


	import java.util.*;
	public class MapProgram {

		public static void main(String[]args) {
			Map<Integer,String> mp=new HashMap<Integer,String>();
			
			mp.put(11, "Mangoes");
			mp.put(13, "Apple");
			mp.put(12,"Pomegranate");
			
			for(Map.Entry me:mp.entrySet())
			{
				System.out.println(me.getKey()+" "+me.getValue());
			}
			
		}
	}



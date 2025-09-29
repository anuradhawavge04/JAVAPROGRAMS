package Assignment_03_CollectionFramework;


	import java.util.*;
	public class TreeMapProgram {

		public static void main(String[]args) {
			TreeMap<Integer,String> mp=new TreeMap<Integer,String>();
			mp.put(54001,"Raj");
			mp.put(54002,"ABC");
			mp.put(54004,"KLj");
			mp.put(54003,"XYZ");
			for(Map.Entry me:mp.entrySet()) {
				System.out.println(me.getKey()+" "+me.getValue());
			}
			
		}
	}



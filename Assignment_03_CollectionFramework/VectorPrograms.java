package Assignment_03_CollectionFramework;


	import java.util.*;
	public class VectorPrograms {

		public static void main(String[]args) {
			
			Vector vector=new Vector(5);
			System.out.println("Size:"+vector.size());
			System.out.println("Capacity:"+vector.capacity());
			
			vector.addElement(new Integer(0));
			vector.addElement(new Integer(1));
			vector.addElement(new Integer(2));
			vector.addElement(new Integer(3));
			vector.addElement(new Integer(4));
			vector.addElement(new Integer(5));
			vector.addElement(new Integer(6));
			vector.addElement(new Integer(5));
			
			
			vector.addElement(new Double(3.14));
			vector.addElement(new Float(3.14));
			
			System.out.println("Capacity:"+vector.capacity());
			System.out.println("Size:"+vector.size());
			System.out.println(vector);
			System.out.println("First Item:"+(Integer)vector.firstElement());
			System.out.println("Last Item:"+(Float)vector.lastElement());
			if(vector.contains(new Integer(3)))
			{
				System.out.println("Found 3");
			}
		}
	}



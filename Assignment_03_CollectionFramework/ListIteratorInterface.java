package Assignment_03_CollectionFramework;


	import java.util.*;
	public class ListIteratorInterface {

		public static void main(String[]args) {
			Vector<Integer> k=new Vector<Integer>();
			k.add(111);
			k.add(222);
			k.add(333);
			ListIterator l1=k.listIterator();
			System.out.println("Iterates in forward direction....");
			
			while(l1.hasNext())
			{
				System.out.println(l1.next()+" ");
				System.out.println("\n\nIterates in backward direction...");
				
			}
			
			while(l1.hasPrevious()) {
				System.out.println(l1.previous()+" ");
			}
		}
	}



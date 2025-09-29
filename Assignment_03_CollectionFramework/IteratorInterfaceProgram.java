package Assignment_03_CollectionFramework;



	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	public class IteratorInterfaceProgram {

		public static void main(String[]args) {
			List<String> list=new LinkedList<>();
			
			list.add("ohio");
			list.add("Florida");
			list.add("California");
			list.add("Alaska");
			System.out.println("The list is give as:"+list);
			
			Iterator<String> i=list.iterator();
		    while(i.hasNext()) {
		    	System.out.println(i.next());
		    	
		    }
		    
		    i.remove();
		    System.out.println("List after removing Last element:"+list);
		}
	}


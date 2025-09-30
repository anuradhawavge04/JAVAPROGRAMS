//1. Construct a linked List containing names of colours: red, blue, yellow and orange. Then 
//extend your program to do the following: 
//i. Display the contents of the List using an Iterator  
//ii. Display the contents of the List in reverse order using a ListIterator  
//iii. Create another list containing pink and green. Insert the elements of this list between blue and yellow.  


package Assignment3;
import java.util.*;

public class ColorLinkedList {

	public static void main(String[]args) {
		LinkedList<String>	colorList	= new LinkedList<>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Yellow");
		colorList.add("Orange");
		
		
		  System.out.println("i. Colors using Iterator:");
	        Iterator<String> iterator = colorList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		
		
		System.out.println("\n Colors in reverse using ListIterator:");
		ListIterator<String> ListIt=colorList.listIterator(colorList.size());
		
		while(ListIt.hasPrevious()) {
			System.out.println(ListIt.previous());
		}
		
		
		LinkedList<String> newColors=new  LinkedList<>();
		newColors.add("Pink");
		newColors.add("Green");
		
		int indexToInsert=colorList.indexOf("Yellow");
		colorList.addAll(indexToInsert,newColors);
		
		System.out.println("\n Final color list after inserting pink and green between blue and yellow:");
		for(String color :colorList) {
			System.out.println(color);
		}
		
	}
}

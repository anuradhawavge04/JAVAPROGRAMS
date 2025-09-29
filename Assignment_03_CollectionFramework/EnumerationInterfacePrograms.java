package Assignment_03_CollectionFramework;

	public class EnumerationInterfacePrograms {

		public static void main(String[]args) {
			java.util.Vector v1;
			
			v1=new java.util.Vector();
			System.out.println("\n New Element in Vector....\n\n");
			v1.add(new Integer(1000));
			v1.add(new Integer(2000));
			v1.add(new Integer(3000));
			
			v1.addElement(new Boolean(true));
			java.util.Enumeration e1=v1.elements();
			while(e1.hasMoreElements()) {
				System.out.println(e1.nextElement());
			}
		}
	}


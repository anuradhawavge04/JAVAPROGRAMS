package Assignment_03_CollectionFramework;



	public class WrapperClass {

		public static void main(String[]args) {
			Integer i1=new Integer("500");
			Integer i2=new Integer(200);
			int i;
			i=i1.intValue();
		    System.out.println("i="+i);
		    i=i2.intValue();
		    System.out.println("i="+i);
		    
		    i=Integer.parseInt("100");
		    System.out.println("i="+i);
		    
		    i1=Integer.valueOf("600");
		    i=i1.intValue();
		    
		    System.out.println("i="+i);
		    i=Integer.valueOf("700").intValue();
		    System.out.println("i="+i);
		}
	}



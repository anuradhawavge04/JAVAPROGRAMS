package Assingment2;


class SuperClass{
		int x=20;
	}

	class subcls extends SuperClass{
		int x=80;
		void display() {
			System.out.println("Super class x:"+super.x);
			System.out.println("Sub class x:"+x);
		}
	}

	public class usingSuperKeyword {

		public static void main(String[] args) {
			subcls obj=new subcls();
			obj.display();

		}

	}



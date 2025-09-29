package Assingment2;


class superclass{
		int x=20;
		void display() {
			System.out.println("Super class x:"+x);
		}
	}

	class subclass extends superclass{
		int x=80;
		void display() {
			System.out.println("Sub class x:"+x);
			super.display();
		}
	}

   class superWithMethod {

		public static void main(String[] args) {
		subclass obj=new subclass();
		obj.display();

		}

	}


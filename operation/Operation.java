package operation;
public interface Operation {
					float radius=5;
					float height=10;
					double PI=3.14;
					
				public void area();
				public void volume();

				}

				class Circle implements Operation{
					 
					public void area() {
						double area_of_circle=PI*radius*radius;
						System.out.println("Area of circle is:"+area_of_circle);
					}
					
					public void volume() {
					    System.out.println("Volume is not applicable for Circle.");
					}
				}

				class cylinder implements Operation{
					public void area() {
						double area_of_cylinder = 2 * PI * radius * (radius + height);
						System.out.println("Area of cylinder is:"+area_of_cylinder);
					}
					
					public void volume() {
						double volume_of_cylinder=PI*radius*radius*height;
						System.out.println("Volume of cylinder is:"+volume_of_cylinder);
					}


				public static void main(String[]args) {

					Operation obj;
					obj=new Circle();
					obj.area();
					obj.volume();
					
					obj=new cylinder();
					obj.area();
					obj.volume();
				}
				}



public class OOPS_concept {

	public class superclass {

		public void displayResult() {

		System.out.println("Printing from superclass");

		}

	}

	public class subclass extends superclass {
		subclass(){
			System.out.println("I am here");
		}
		public void displayResult() {

			System.out.println("Displaying from subClass");
	
			super.displayResult();
			
			System.out.println("Displayin subclass");
			System.out.println(Math.round(3.7));
			

		}
	}
		
	public static void main(String args[]) {
		OOPS_concept obj = new OOPS_concept();

		superclass obj1 = obj.new subclass();

		obj1.displayResult();

	}

		
}

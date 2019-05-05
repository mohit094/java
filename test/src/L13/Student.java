package L13;

public class Student {
	int rollNumber;
	String name;
	Student(int rollNumber){
		System.out.println("Constructor Called");
		this.rollNumber = rollNumber;//this contains the address of the current object
	}
	Student(Student s){
		System.out.println("Copy Constructor Called");
		this.rollNumber = s.rollNumber;
	}
	public void func1(){
		
	}
	public static void func2(){
		
	}
}

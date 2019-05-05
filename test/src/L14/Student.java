package L14;

public class Student implements compare<Student>{
	int marks;
	
	public boolean isGreater1(Student s) {
		if(this.marks > s.marks)
			return true;
		else
			return false;
	}

	@Override
	public boolean isGreater(Student s) {
		// TODO Auto-generated method stub
		return false;
	}
}

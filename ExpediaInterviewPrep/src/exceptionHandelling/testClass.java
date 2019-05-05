package exceptionHandelling;

public class testClass {
	
	
	public static void main(String[] args) {
		/*System.out.println(test());*/
		WrappedString ws1 = new WrappedString();
	    WrappedString ws2 = new WrappedString();
	    System.out.println(ws1.equals(ws2));
	}
	
	private final static int test(){
		try{
			int i = 50/0;
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally{
			System.out.println("I am here");
			
		}
	}
}

class WrappedString {
    private final String str = "hello";
}

class testclass2 extends testClass{
	public int test(){return 1;}
}

package Assignment_Recursion1a;


public class geometricSum {
	public static void main(String[] args) {
		double value = findGeometricSum(3);
		System.out.println(value);
	}
	
	public static double findGeometricSum(int k){
		// Write your code here
        if(k == 0){
            return 1;
        }
        
        double geometricSum = 1/Math.pow(2, k) + findGeometricSum(k-1);
        return geometricSum;
	}
}

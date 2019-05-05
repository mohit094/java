import java.util.Scanner;
import java.lang.Math;

public class test_codeZen {
//	fundamentals 3
		//no of zeroes
/*		public static void main(String[] args) {
			// Write your code here
	        Scanner s = new Scanner(System.in);
	        int i = s.nextInt();
	        int k = 0;
	        while(i/5!=0){
	           k = k+i/5;
	           i = i/5;
	        }
	        System.out.println(k);
		}*/
		//Pattern - Second Last Question
		/*public static void main(String[] args) {
			// Write your code here
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();	
	        for(int i=1;i<=n;i++){
//	        	System.out.print("I here1");
	        	for(int k=1;k<=i;k++){
	        		System.out.print(k);
//	        		System.out.print("I here2");
	        	}
	        	for(int j=1;j<n-i;j++){
	        		System.out.print(" ");
//	        		System.out.print("I here3");
	        	}
	        	for(int t=i;t>=1;t--){
	        		System.out.print(t);
//	        		System.out.print("I here4");
	        	}
//	        	System.out.print("I here5");
	        	System.out.println();;
	        }
		}*/
//	pair of a and b
	
	/*public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long t = Math.round(Math.sqrt(n));
        long numb1,numb2;
        for(long i=0;i<t;i++){
        	numb1 = i;
        	if(numb1<t/2){
        		for(long j=t;j>=t-i;j--){
    	        	numb2 = j;
    	        	if((numb1*numb1+numb2*numb2)==n){
    	        		System.out.println(numb1 +" "+numb2);
    	        	}	
    	        }
        	}
        	else{
        		for(long k = i;k<=t;k++){
        			numb2 = k;
    	        	if((numb1*numb1+numb2*numb2)==n){
    	        		System.out.println(numb1 +" "+numb2);
    	        	}
        		}
        	
        	}
        }
	}*/
//	ap
	
	/*public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if( n>2){
        	int numb1 = s.nextInt();
            int numb2 = s.nextInt();
            int subtract = numb2 - numb1;
            boolean flag = true;
            for (int i=3;i<=n;i++){
            	int temp = s.nextInt();
            	numb1 = numb2;
            	numb2 = temp;
            	System.out.print(numb1 + " and " + numb2);
            	System.out.println("I am here");
            	if(numb2 - numb1 != subtract){
            		flag = false;
            		break;
            	}
            }
            System.out.println(flag);
        }
        else{
        	System.out.println(false);
        }
	}*/
	
//	leap year
		
	/*public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        double y1 = s.nextInt();
        double y2 = s.nextInt();
        double firstExpectedYear = -1;
        for(double i = y1; i <= y2 && i<i+4; i++){
        	if(i%4==0){
        		firstExpectedYear = i;
        		break;
        	}
        }
        if(firstExpectedYear!=-1){
        	for(double k = firstExpectedYear; k <= y2 ; k+=4){
            	if(k%100 == 0){
            		if(k % 400 == 0){
            			System.out.print(Math.round(k)+" ");
            		}
            	}
            	else{
            		System.out.print(Math.round(k) + " ");
            	}
            }
        }
	}*/
	// replace 0 by 5
/*	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int finalValue = 0;
        int value = 0;
        for(i = 0; n/10!= 0; i++ ){
        	value = n%10;
        	if(value == 0){
        		value+=5;
        		finalValue += value*Math.pow(10, i);
        		
        	}
        	else{
        		finalValue += value*Math.pow(10, i);;
        	}
        	n = n/10;
        }
        finalValue += n*Math.pow(10, i);
        System.out.println(finalValue);          	
	}*/
	//palindrome
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nduplicate = n;
        int i = 0;
        int finalValue = 0;
        int value = 0;
        for(i = 0; nduplicate/10!= 0; i++ ){
        	nduplicate = nduplicate/10;
        }
        
        nduplicate = n;
        
        for(int k = i;k>=0 ; k-- ){
        	value = nduplicate%10;
        	finalValue += value*Math.pow(10, k);
        	nduplicate = nduplicate/10;
        }
        
        if(finalValue == n){
        	System.out.println(true);
        }
        else{
        	System.out.println(false);
        }
	}
	

}

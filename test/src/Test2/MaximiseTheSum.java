package Test2;

public class MaximiseTheSum {
	public static void main(String[] args) {
		int [] input1 = {1,5,10,15,20,25};
		int [] input2 = {2,4,5,12,15};
		maximumSumPath(input1,input2);
	}
	public static int maximumSumPath(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int sum1 = 0, sum2 = 0, finalSum = 0;
		int index1 = 0, index2 = 0;
		int l = 0;
		for (int m = 0; m < input1.length; m++) {
		    sum1 = 0;
		    sum2 = 0;
			for (; l < input2.length; l++) {
				if (input1[m] == input2[l]) {
					
					for(int t = index1; t<=m; t++){
						sum1 = sum1 + input1[t];
					}
					for(int k = index2; k <= l; k++){
						sum2 = sum2 + input2[k];
					}
					
					if(sum1 >= sum2){
						finalSum = finalSum + sum1;
					}
					else{
						finalSum = finalSum + sum2;
					}
					index1 = m + 1;
					index2 = l + 1;
					
					l++;
					break;
				}
				if (input1[m] < input2[l]) {
					break;
				}
			}
			
		}
		sum1 = 0; sum2 = 0;
		if(index1 < input1.length){
			for(int t = index1; t<input1.length; t++){
				sum1 = sum1 + input1[t];
			}	
		}
		if(index2 < input2.length){
			for(int k = index2; k < input2.length; k++){
				sum2 = sum2 + input2[k];
			}
		}
		if(sum1 >= sum2){
			finalSum = finalSum + sum1;
		}
		else{
			finalSum = finalSum + sum2;
		}
//		System.out.println(finalSum);
		return finalSum;
		
		
	}
}

package Assignment_Array1;

public class sumOfTwoArrays {
	public static void main(String[] args) {
		int arr1[] = {8,6,5};
		int arr2[] = {9,6,5,4};
		sumOfTwo(arr1,arr2);
	}
	public static void sumOfTwo(int arr1[],int arr2[]){
		int firstArray[] = arr1;
		int secondArray[] = arr2;
		int shorterArrayLength = arr2.length;
		
		if(arr2.length>arr1.length){
			firstArray = arr2;
			secondArray = arr1;
			shorterArrayLength = arr1.length;
		}
		int finalArray[] = new int[firstArray.length+1];
		int carry = 0;
		int finalArrayIndex = 0;
		for(int i = firstArray.length-1,j = secondArray.length-1; i>=firstArray.length-shorterArrayLength;i--,j--){
			int sum = firstArray[i] + secondArray[j] + carry;
			System.out.println("Value of sum for " + i + " : " + sum);
			if(sum/10 == 0){
				carry = 0;
				finalArray[finalArray.length-1-finalArrayIndex] = sum;
				finalArrayIndex++;
			}
			else{
				carry = 1;
				sum = sum%10;
				finalArray[finalArray.length-1-finalArrayIndex] = sum;
				finalArrayIndex++;
			}
		}
		for(int k = firstArray.length-shorterArrayLength-1;k>=0;k--){
			int sum = firstArray[k]+carry;
			if(sum/10 == 0){
				carry = 0;
				finalArray[finalArray.length-1-finalArrayIndex] = sum;
				finalArrayIndex++;
			}
			else{
				carry = 1;
				sum = sum%10;
				finalArray[finalArray.length-1-finalArrayIndex] = sum;
				finalArrayIndex++;
			}
		}
		finalArray[0] = carry;
		for(int t=0;t<=finalArray.length-1;t++){
			System.out.print(finalArray[t]);
		}
		
	}
}

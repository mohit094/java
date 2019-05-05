import java.math.BigInteger;
import java.util.Arrays;

public class preOrder_InOrder {
	public static int[] mergeSort(int[] arr){
		if(arr.length == 1 || arr.length == 0){
			return arr;
		}
		int mid = (arr.length)/2;
		int[] arr1 = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] arr2 = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		int[] finalArr = new int[arr1.length+arr2.length];
		
		int i = 0,j = 0, k = 0;
		while(i<arr1.length && j<arr2.length){
			
		}
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("9223372036854775808");
		BigInteger result = a.add(b);
		return arr;
	}
}

package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class sort_012_problem {
	public static void main(String[] args) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(6);
		temp.add(5);
		temp.add(4);
		temp.add(3);
		temp.add(2);
		temp.add(1);
		Collections.sort(temp);
		System.out.println(Collections.binarySearch(temp, 6));
		Collections.binarySearch(temp, 2);
	}
	public static int[] sortProblem(int[] arr){
		int zero = 0;
		int one = 0;
		int two = arr.length -1;
		int temp = 0;
		while(one<=two){
			switch(arr[one]){
			case 0:
			{
				temp = arr[one];
				arr[one] = arr[zero];
				arr[zero] = temp;
				zero++;
				one++;
				break;
			}
			case 1:
			{
				one++;
				break;
			}
			case 2:
			{
				temp = arr[one];
				arr[one] = arr[two];
				arr[two] = temp;
				two--;
				break;
			}
			}
		}
		
		return arr;
				
	}
}

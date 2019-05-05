package STL_Section;

import java.util.ArrayList;
import java.util.Collections;

public class kthLargest {
	public static int kthLargest(int arr[], int k){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i : arr){
			temp.add(i);
		}
		Collections.sort(temp);
		return temp.get(k);
	}
}

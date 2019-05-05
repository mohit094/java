package Practice_array;

import java.util.ArrayList;

public class smallestSubarray {
	public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) {
		// Write your code here
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		int finalSum = 0;
		
		/*for(int i : input){
			if(i>sum){
				finalList.clear();
				finalList.add(i);
				return finalList;
			}
			
		}*/
		for(int i = 0; i < input.size(); i++){
			if(input.get(i)>sum){
				finalList.add(input.get(i));
				return finalList;
			}
			int tempSum = 0;
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int j = i; j>=0; j--){
				tempSum+=input.get(j);
				tempList.add(input.get(j));
				if(tempSum>sum){
					break;
				}
			}
			if(tempSum>sum && finalList.size()==0){
				finalList = tempList;
			}
			else if(tempSum>sum && finalList.size()>tempList.size()){
				for(int k = tempList.size()-1; k>=0; k--){
					finalList.add(tempList.get(k));
				}
			}
		}
		return finalList;
	}
}

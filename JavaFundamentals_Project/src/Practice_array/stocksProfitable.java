package Practice_array;

import java.util.Arrays;

import L14.main2;

final class returnClass{
	int maxValue = Integer.MIN_VALUE;
	int maxDifference = Integer.MIN_VALUE;
	int buyPrice = 0;
	int sellPrice = 0;
}
public class stocksProfitable {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(maxProfit(arr));
	}
	public static int maxProfit(int stockprices[])
	{
	    //Write code here 
	    returnClass temp = maxProfit(stockprices,5);
	    return temp.maxDifference;
	}
	
	public static returnClass maxProfit(int stockprices[],int length)
	{
		//Write code here
		if(stockprices.length == 1){
			returnClass temp = new returnClass();
			temp.maxDifference = 0;
			temp.maxValue = stockprices[0];
			temp.buyPrice = stockprices[0];
			temp.sellPrice = stockprices[0];
			return temp;
		}
		
		returnClass temp = maxProfit(Arrays.copyOfRange(stockprices, 1, stockprices.length),stockprices.length);
		if(temp.maxValue - stockprices[0] > temp.maxDifference){
			temp.maxDifference = temp.maxValue - stockprices[0];
			temp.buyPrice = stockprices[0];
			temp.sellPrice = temp.maxValue;
			return temp;
		}
		else if(stockprices[0]>temp.maxValue){
			temp.maxValue = stockprices[0]; 
		}
		return temp;
	}
}

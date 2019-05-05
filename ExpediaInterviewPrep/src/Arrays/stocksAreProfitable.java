package Arrays;

public class stocksAreProfitable {
	public static int maxProfit(int stockprices[]){
		int min = stockprices[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i = 1; i<stockprices.length; i++){
			if(stockprices[i]-min > maxProfit){
				maxProfit = stockprices[i]-min;
			}
			if(stockprices[i]<min){
				min = stockprices[i];
			}
		}
		
		return maxProfit;
	}
}

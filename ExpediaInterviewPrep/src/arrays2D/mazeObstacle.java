package arrays2D;

public class mazeObstacle {
	public static int countPaths(int temp[][],int i,int j)
	{
	//Write code here 
      return countPaths2(temp,0,0);
	}
  	public static int countPaths2(int temp[][],int i,int j)
	{
	//Write code here 
      if(i == temp.length-1 && j == temp[0].length-1){
			return 0;
      }
      if(temp[i][j] == -1){
        return 0;
      }
      int right = 0;
      int down = 0;
      if(i+1<temp.length){
        right = countPaths(temp,i+1,j);
      }
      if(j+1<temp[0].length){
        down = countPaths(temp,i,j+1);
      }
      int finalAns = right + down;

      return finalAns;
	}
}

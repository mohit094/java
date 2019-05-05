import java.util.Scanner;
import java.lang.Math;

public class array1_Assignment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] firstArray = new int[n];
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = s.nextInt();
		}
		int t = s.nextInt();
		int[] secondArray = new int[t];
		for (int k = 0; k < secondArray.length; k++) {
			secondArray[k] = s.nextInt();
		}

		for (int m = 0; m < firstArray.length; m++) {
			for (int l = 0; l < secondArray.length; l++) {
				if (firstArray[m] == secondArray[l]) {
					System.out.println(firstArray[m]);
					break;
				}
			}
		}

	}
}

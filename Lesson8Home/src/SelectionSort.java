import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {4,8,6,9,3,5,2,4,61,3};

		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	static void selectionSort(int[] masiv) {
		
		for(int j = 0; j < (masiv.length+1)/2; j++) {
			int min = j;
			int max = j;
			for(int i = j+1; i < masiv.length - j; i++) {
				if(masiv[min] > masiv[i]) {
					min = i;
				}
				if(masiv[max] < masiv[i]) {
					max = i;
				}
			}
			int temp = masiv[j];
			masiv[j] = masiv[min];
			masiv[min] = temp;
			
			temp = masiv[masiv.length-1-j];
			masiv[masiv.length-1-j] = masiv[max];
			masiv[max] = temp;
		}
		
		
	}
}

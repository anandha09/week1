package week1.day2;

import java.util.Arrays;

public class Missingelements {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sortthe array	
				
			Arrays.sort(arr);
				
				

				// loop through the array (start i from arr[0] till the length of the array)
				
				for(int i=arr[0];i<=arr.length;i++){
					int val=arr[i+1]-1;
					if(val!=arr[i]){
						System.out.println(val);
						break;
						

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
						
						
				

			}

		}

	}

}

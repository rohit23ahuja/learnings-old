package arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFactorsInArray {

	public static void main(String[] args) {
		int[] arr = {4, 2, -1, 40, 58, 10, 5};
		findPairs(arr, 20);
	}

	private static void findPairs(int[] arr, int product) {
		Map<Integer, Integer> numbers = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(numbers.containsKey(product/arr[i])) {
				System.out.println(arr[i]+" "+product/arr[i]);
			} else {
				numbers.put(arr[i],1);
			}
		}
		
	}

}

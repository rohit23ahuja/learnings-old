package eleven.essentials.solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentItemInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 3, 3, 1 };
		//usingTempArray(arr);
		usingHashMap(arr);
	}

	private static void usingHashMap(int[] arr) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		Integer frequency = -1;
		Integer frequent = -1;
		for (int i : arr) {
			if (frequencyMap.containsKey(i)) {
				frequencyMap.put(i, frequencyMap.get(i)+1);
			} else {
				frequencyMap.put(i, 1);
			}
			if (frequency<frequencyMap.get(i)) {
				frequency = frequencyMap.get(i);
				frequent = i;
			}
		}
		System.out.println(frequent+" "+frequency);
	}

	
	
	
	private static void usingTempArray(int[] arr) {
		int[] tempArr = new int[arr.length];
		for (int i = 0; i < tempArr.length; i++) 
			tempArr[i] =0;
		for (int i = 0; i < arr.length; i++) {
			tempArr[arr[i]] = tempArr[arr[i]]+1;
		}
		
		int frequent =-1;
		int frequency =0;
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i]>frequency) {
				frequent =i;
				frequency=tempArr[i];
			}
		}
		System.out.println(frequent+" "+frequency);
	}
}

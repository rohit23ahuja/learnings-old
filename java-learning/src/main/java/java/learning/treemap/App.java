package java.learning.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Map<Country, Integer> capitals = new TreeMap<>();
		capitals.put(new Country("India"), 1);
		capitals.put(new Country("UK"), 2);
		capitals.put(new Country("China"), 5);
		capitals.put(new Country("Canada"), 3);
		capitals.put(new Country("US"), 4);
		for (Country country : capitals.keySet()) {
			System.out.println("Country "+country.getName()+" Capital "+capitals.get(country));
		}
		System.out.println("=============================");
		SortedSet<Map.Entry<Country, Integer>> entriesByValue = entriesSortedByValue(capitals);
		for (Entry<Country, Integer> entry : entriesByValue) {
			System.out.println("Country "+entry.getKey().getName()+" Capital "+entry.getValue());
		}
	}
	
	public static<K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValue(Map<K, V> capitals){
/*		SortedSet<Map.Entry<Country, String>> sorted = new TreeSet<>(new Comparator<Map.Entry<Country, String>>() {
			@Override
			public int compare(Map.Entry<Country, String> o1, Map.Entry<Country, String> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		});*/
		SortedSet<Map.Entry<K, V>> sorted = new TreeSet<>((Map.Entry<K,V> o1, Map.Entry<K,V> o2) -> o1.getValue().compareTo(o2.getValue()));
		sorted.addAll(capitals.entrySet());
		return sorted;
	}
	

}

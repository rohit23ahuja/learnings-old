package learn.treemap;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App2 {

	public static void main(String[] args) {
		Map<LocalDate, Country> countryOrigins = new TreeMap<>((LocalDate o1, LocalDate o2) -> o1.compareTo(o2));
		countryOrigins.put(LocalDate.of(1947, 8, 15), new Country("India"));
		countryOrigins.put(LocalDate.of(1776, 7, 4), new Country("US"));
		countryOrigins.put(LocalDate.of(1881, 1, 1), new Country("UK"));
		countryOrigins.put(LocalDate.of(1960, 8, 15), new Country("Malay"));
		
		for (Entry<LocalDate, Country> entry : countryOrigins.entrySet()) {
			System.out.println("Date "+entry.getKey()+" country "+entry.getValue().getName());
		}
	}

}

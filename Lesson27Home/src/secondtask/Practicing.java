package secondtask;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practicing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inpute message");
		String text = scanner.nextLine();
		LinkedHashMap<Character, Integer> map = findOccurences(text);
		int percent = 100 / text.length();

		System.out.println("-----------------------------------");
		System.out.println("Only added in hashmap.");
		System.out.println("-----------------------------------");

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("-----------------------------------");
		System.out.println("Sorted in hashMap by value");
		System.out.println("-----------------------------------");
		map = sortByValue(map);
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Sorted in hashMap by value with percents");
		System.out.println("-----------------------------------");
		
		HashMap<Character, HashMap<Integer, String>> finalMap = insertPercent(percent, map);
		
		for (Entry<Character, HashMap<Integer, String>> entry : finalMap.entrySet()) {
			System.out.print(entry.getKey() + ": ");
			for (Entry<Integer, String> entry2 : entry.getValue().entrySet()) {
				System.out.println(entry2.getKey() + " " + entry2.getValue());
			}
			
		}
	}


	private static LinkedHashMap<Character, Integer> findOccurences(String text) {
		LinkedHashMap<Character, Integer> occurences = new LinkedHashMap<Character, Integer>();
		char[] array = text.toUpperCase().toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ' || array[i] == ',' || array[i] == '.')
				continue;
			if (occurences.containsKey(array[i])) {
				Integer value = occurences.get(array[i]);
				occurences.put(array[i], value + 1);
			}
			else {
				occurences.put(array[i], 1);
			}
		}
		return occurences;
	}
	
	public static LinkedHashMap<Character, Integer> sortByValue( LinkedHashMap<Character, Integer> map ) {
		List<Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo( o1.getValue());
			}
		});
		LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
		for (Map.Entry<Character, Integer> entry : list ) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static LinkedHashMap<Character, HashMap<Integer, String>> insertPercent(int percent,
			LinkedHashMap<Character, Integer> map) {
		LinkedHashMap<Character, HashMap<Integer, String>> finalMap = new LinkedHashMap<Character, HashMap<Integer, String>>();
		for(Entry<Character, Integer> entry : map.entrySet()) {
			HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			String percentage = "";
			for (int i = 0; i < percent * entry.getValue(); i++) {
				percentage = percentage + "#";
			}
			hashMap.put(entry.getValue(), percentage);
			finalMap.put(entry.getKey(), hashMap);
		}
		
		return finalMap;
	}
	
}

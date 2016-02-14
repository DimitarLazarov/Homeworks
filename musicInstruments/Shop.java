package musicInstruments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

public class Shop {

	public enum TypeOfInstrument implements Comparable<TypeOfInstrument>{
		STRUNNI, UDARNI, DUHOVI, KLAVISHNI, ELEKTRONNI;
		
	}
	
	private int money;
	private HashMap<TypeOfInstrument, HashMap<MusicInstrument, Integer>> stocks;	
	private HashMap<TypeOfInstrument, HashMap<MusicInstrument, Integer>> soldStocks;
	
	public Shop(){
		money = 0;
		Random rand = new Random();
		stocks = new HashMap<TypeOfInstrument, HashMap<MusicInstrument, Integer>>();
		soldStocks = new HashMap<TypeOfInstrument, HashMap<MusicInstrument, Integer>>();
		stocks.put(TypeOfInstrument.STRUNNI, new HashMap<MusicInstrument, Integer>());
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Cigulka", 100, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Viola", 90, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Kontrabas", 110, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Arfa", 120, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Kitara", 150, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Gydulka", 170, rand.nextInt(1000)), 3);
		stocks.put(TypeOfInstrument.UDARNI, new HashMap<MusicInstrument, Integer>());
		stocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Barabani", 200, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Tarambuka", 50, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Typan", 130, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Daire", 20, rand.nextInt(1000)), 3);
		stocks.put(TypeOfInstrument.DUHOVI, new HashMap<MusicInstrument, Integer>());
		stocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Trompet", 210, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Trombon", 240, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Tuba", 170, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Fleita", 80, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Klarinet", 110, rand.nextInt(1000)), 3);
		stocks.put(TypeOfInstrument.KLAVISHNI, new HashMap<MusicInstrument, Integer>());
		stocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Organ", 200, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Piano", 470, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Akardeon", 210, rand.nextInt(1000)), 3);
		stocks.put(TypeOfInstrument.ELEKTRONNI, new HashMap<MusicInstrument, Integer>());
		stocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Sintezator", 300, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Bas kitara", 350, rand.nextInt(1000)), 3);
		stocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Elektricheska cigulka", 420, rand.nextInt(1000)), 3);
		
		soldStocks.put(TypeOfInstrument.STRUNNI, new HashMap<MusicInstrument, Integer>());
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Cigulka", 100, 0), 0);
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Viola", 90, 0), 0);
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Kontrabas", 110, 0), 0);
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Arfa", 120, 0), 0);
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Kitara", 150, 0), 0);
		soldStocks.get(TypeOfInstrument.STRUNNI).put(new MusicInstrument("Gydulka", 170, 0), 0);
		soldStocks.put(TypeOfInstrument.UDARNI, new HashMap<MusicInstrument, Integer>());
		soldStocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Barabani", 200, 0), 0);
		soldStocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Tarambuka", 50, 0), 0);
		soldStocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Typan", 130, 0), 0);
		soldStocks.get(TypeOfInstrument.UDARNI).put(new MusicInstrument("Daire", 20, 0), 0);
		soldStocks.put(TypeOfInstrument.DUHOVI, new HashMap<MusicInstrument, Integer>());
		soldStocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Trompet", 210, 0), 0);
		soldStocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Trombon", 240, 0), 0);
		soldStocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Tuba", 170, 0), 0);
		soldStocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Fleita", 80, 0), 0);
		soldStocks.get(TypeOfInstrument.DUHOVI).put(new MusicInstrument("Klarinet", 110, 0), 0);
		soldStocks.put(TypeOfInstrument.KLAVISHNI, new HashMap<MusicInstrument, Integer>());
		soldStocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Organ", 200, 0), 0);
		soldStocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Piano", 470, 0), 0);
		soldStocks.get(TypeOfInstrument.KLAVISHNI).put(new MusicInstrument("Akardeon", 210, 0), 0);
		soldStocks.put(TypeOfInstrument.ELEKTRONNI, new HashMap<MusicInstrument, Integer>());
		soldStocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Sintezator", 300, 0), 0);
		soldStocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Bas kitara", 350, 0), 0);
		soldStocks.get(TypeOfInstrument.ELEKTRONNI).put(new MusicInstrument("Elektricheska cigulka", 420, 0), 0);
	}
	
	public int getMoney(){
		return money;
	}
	
	private void addSoldProduct(String name, int quantity) {
		for(HashMap<MusicInstrument, Integer> map : soldStocks.values()) {
			for(Entry<MusicInstrument, Integer>  instrument : map.entrySet()) {
				if (instrument.getKey().getName().equals(name)) {
					map.put(instrument.getKey(), instrument.getValue() + quantity);
				}
			}
		}
	}
	
	public int getDeliveryTimeOfInstrument(String name) {
		for(HashMap<MusicInstrument, Integer> map : stocks.values()) {
			for(Entry<MusicInstrument, Integer>  instrument : map.entrySet()) {
				if (instrument.getKey().getName().equals(name)) {
					return instrument.getKey().getDelirveryTime();
				}
			}
		}
		return 1000;
	}
	
	
	public synchronized void sellProduct(String name, int quantity) throws InterruptedException {
		if (hasProductInShop(name, quantity)) {
			removeFromShop(name, quantity);
			addSoldProduct(name, quantity);
			notify();
		}
		else {
			wait();
			System.out.println("In this moment there isnt " + name + " in the shop.");
		}
	}
	
	public synchronized void suply(String name, int quantity) throws InterruptedException {
		for(HashMap<MusicInstrument, Integer> map : stocks.values()) {
			for(Entry<MusicInstrument, Integer>  instrument : map.entrySet()) {
				if (instrument.getKey().getName().equals(name)) {
					map.put(instrument.getKey(), instrument.getValue() + quantity);
				}
			}
		}
		notify();
		wait();
	}
	
	public synchronized void monthSuply(String name, int quantity) {
		for(HashMap<MusicInstrument, Integer> map : stocks.values()) {
			for(Entry<MusicInstrument, Integer>  instrument : map.entrySet()) {
				if (instrument.getKey().getName().equals(name)) {
					map.put(instrument.getKey(), instrument.getValue() + quantity);
				}
			}
		}
		
	}



	private void removeFromShop(String name, int quantity) {
		for(HashMap<MusicInstrument, Integer> map : stocks.values()) {
			for(Entry<MusicInstrument, Integer>  instrument : map.entrySet()) {
				if (instrument.getKey().getName().equals(name)) {
					map.put(instrument.getKey(), instrument.getValue() - quantity);
					money = money + (instrument.getKey().getPrice() * quantity);
				}
			}
		}
		
	}



	public boolean hasProductInShop(String name, int quantity) {
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : stocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				if (e.getKey().getName().equals(name) && e.getValue() >= quantity)
					return true;
			}
		}
		return false;
	}
	
	public TreeMap<TypeOfInstrument, ArrayList<MusicInstrument>> getCatalogOfShop() {
		TreeMap<TypeOfInstrument, ArrayList<MusicInstrument>> map = new TreeMap<TypeOfInstrument, ArrayList<MusicInstrument>>();
		for (Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry: stocks.entrySet()) {
			map.put(entry.getKey(), new ArrayList<MusicInstrument>());
			for (Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				map.get(entry.getKey()).add(e.getKey());
			}
		}
		
		return map;
	}
	
	public List<MusicInstrument> getAllInstrumentsAlphabetically() {
		List<MusicInstrument> list = new ArrayList<MusicInstrument>();
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : stocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				list.add(e.getKey());
			}
		}
		Collections.sort(list, new Comparator<MusicInstrument>() {

			@Override
			public int compare(MusicInstrument arg0, MusicInstrument arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
			
		});
		
		return list;
	}
	
	public List<MusicInstrument> getAllInstrumentsSortedByGrowingPrice() {
		List<MusicInstrument> list = new ArrayList<MusicInstrument>();
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : stocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				list.add(e.getKey());
			}
		}
		Collections.sort(list, new Comparator<MusicInstrument>() {

			@Override
			public int compare(MusicInstrument arg0, MusicInstrument arg1) {
				if (arg0.getPrice() > arg1.getPrice()) {
					return 1;
				}
				else if (arg0.getPrice() < arg1.getPrice()) {
					return -1;
				}
				else {
					return 0;
				}
			}
			
		});
		
		return list;
	}
	
	public List<MusicInstrument> getAllInstrumentsSortedByDescendingPrice() {
		List<MusicInstrument> list = new ArrayList<MusicInstrument>();
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : stocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				list.add(e.getKey());
			}
		}
		Collections.sort(list, new Comparator<MusicInstrument>() {

			@Override
			public int compare(MusicInstrument arg0, MusicInstrument arg1) {
				if (arg0.getPrice() > arg1.getPrice()) {
					return -1;
				}
				else if (arg0.getPrice() < arg1.getPrice()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		});
		
		return list;
	}
	
	public List<MusicInstrument> getAllInstrumentInTheShopAtTheMoment() {
		List<MusicInstrument> list = new ArrayList<MusicInstrument>();
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : stocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				if (e.getValue() > 0) {
					list.add(e.getKey());
				}
			}
		}
		
		return list;
	}
	
	public void printSoldProducts() {
		System.out.println(soldStocks);
	}
	
	public void showInfoMostSellingInstrument() {
		MusicInstrument mostSold = null;
		int timesSold = 0;
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : soldStocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				if (e.getValue() > timesSold) {
					timesSold = e.getValue();
					mostSold = e.getKey();
				}
			}
		}
		if (timesSold == 0) {
			System.out.println("The shop has not sold any instrument.");
		}
		else {
			System.out.println("Most sold instruent is " + mostSold.getName() + " Sold " + timesSold + " times.");
		}
		
	}
	
	public void showInfoLowSellingInstrument() {
		MusicInstrument lowSold = null;
		int timesSold = 0;
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : soldStocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				if (e.getValue() <= timesSold) {
					timesSold = e.getValue();
					lowSold = e.getKey();
				}
			}
		}
		System.out.println("Low sold instruent is " + lowSold.getName() + " Sold " + timesSold + " times.");
		
		
	}
	
	public void showInfoMostSellingType() {
		int timesSold = 0;
		int currentTypeSolds = 0;
		TypeOfInstrument mostSold = null;
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : soldStocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				currentTypeSolds += e.getValue(); 
			}
			
			if (currentTypeSolds > timesSold) {
				timesSold = currentTypeSolds;
				mostSold = entry.getKey();
			}
			currentTypeSolds = 0;
		}
		if (mostSold == null) {
			System.out.println("The shop has not sold any instrument.");
		}
		else {
			System.out.println("Most sold type are " + mostSold + " with " + timesSold + " sold instruments.");
			for (Entry<MusicInstrument, Integer> entry : soldStocks.get(mostSold).entrySet()) {
				System.out.println("\t" + entry.getKey() + " sold " + entry.getValue() + " times.");
			}
		}
	}
	
	
	public void showInfoMostMakingCashType() {
		int mostCash = 0;
		int currentCash = 0;
		TypeOfInstrument mostSoldCash = null;
		for(Entry<TypeOfInstrument, HashMap<MusicInstrument, Integer>> entry : soldStocks.entrySet()) {
			for(Entry<MusicInstrument, Integer> e : entry.getValue().entrySet()) {
				currentCash += e.getValue() * e.getKey().getPrice(); 
			}
			
			if (currentCash > mostCash) {
				mostCash = currentCash;
				mostSoldCash = entry.getKey();
			}
			currentCash = 0;
		}
		if (mostSoldCash == null) {
			System.out.println("The shop has not sold any instrument.");
		}
		else {
			System.out.println("Most making money type are " + mostSoldCash + " with " + mostCash + " money made.");
			for (Entry<MusicInstrument, Integer> entry : soldStocks.get(mostSoldCash).entrySet()) {
				System.out.println("\t" + entry.getKey() + " made " + entry.getValue() * entry.getKey().getPrice() + " cash.");
			}
		}
	}
	
	public LinkedHashMap<MusicInstrument, Integer> getAllSoldSortByQuantity() {
		HashMap<MusicInstrument, Integer> allSold = new HashMap<MusicInstrument, Integer>();
		for(HashMap<MusicInstrument, Integer> entry : soldStocks.values()) {
			for (Entry<MusicInstrument, Integer> e : entry.entrySet()) {
				if (e.getValue() > 0) {
					allSold.put(e.getKey(), e.getValue());
				}
			}
		}
		List<Entry<MusicInstrument, Integer>> list = new LinkedList<Entry<MusicInstrument, Integer>>(allSold.entrySet());
		list.sort(new Comparator<Entry<MusicInstrument, Integer>>() {

			@Override
			public int compare(Entry<MusicInstrument, Integer> o1, Entry<MusicInstrument, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
				
			}
			
		});
		
		LinkedHashMap<MusicInstrument, Integer> sortedMap = new LinkedHashMap<MusicInstrument, Integer>();
		for (Map.Entry<MusicInstrument, Integer> entry : list ) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public List<String> getMissingInstruments() {
		List<String> missing = new ArrayList<String>();
		for (HashMap<MusicInstrument, Integer> entry : stocks.values()) {
			for(Entry<MusicInstrument, Integer> e : entry.entrySet()) {
				if (e.getValue() == 0) {
					missing.add(e.getKey().getName());
				}
			}
		}
		return missing;
	}
	
}

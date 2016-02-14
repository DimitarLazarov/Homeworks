package warehouse;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.omg.CORBA.Current;

import warehouse.Warehousehome.Product;

public class Warehousehome {

	private static final int MIN_QUANTITY = 15;

	public enum Product {
		VEGETABLES, FRUITS, MEAT
	};

	private TreeMap<Product, TreeMap<String, Integer>> products;

	public Warehousehome() {
		products = new TreeMap<Product, TreeMap<String, Integer>>();
		products.put(Product.VEGETABLES, new TreeMap<String, Integer>());
		products.get(Product.VEGETABLES).put("Tomato", 15);
		products.get(Product.VEGETABLES).put("Potato", 15);
		products.get(Product.VEGETABLES).put("Cucumber", 15);
		products.put(Product.FRUITS, new TreeMap<String, Integer>());
		products.get(Product.FRUITS).put("Orange", 15);
		products.get(Product.FRUITS).put("Apple", 15);
		products.get(Product.FRUITS).put("Banana", 15);
		products.put(Product.MEAT, new TreeMap<String, Integer>());
		products.get(Product.MEAT).put("Beaf", 15);
		products.get(Product.MEAT).put("Chiken", 15);
		products.get(Product.MEAT).put("Pork", 15);
	}

	public synchronized void getProduct(String product) {
		if (hasProductInWarehouse(product)) {
			take(product);
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void take(String product) {
		for (TreeMap<String, Integer> entry : products.values()) {
			if (entry.containsKey(product)) {
				entry.put(product, entry.get(product) - 5);
				System.out.println(Thread.currentThread().getName() + " take 5 " + product + ". Current quantity in warehouse = " + entry.get(product));
			}
		}
	}

	private boolean hasProductInWarehouse(String product) {
		for (TreeMap<String, Integer> entry : products.values()) {
			if (entry.containsKey(product) && entry.get(product) >= MIN_QUANTITY) {
				return true;
			}

		}
		return false;
	}

	public synchronized void suply() {
		ArrayList<String> depletedProducts = new ArrayList<>();
		depletedProducts = getDepletedProducts();
		if (!depletedProducts.isEmpty()) {
			fill(depletedProducts);
			notifyAll();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void fill(ArrayList<String> depletedProducts) {
		for (String key : depletedProducts) {
			for (TreeMap<String, Integer> subMap : products.values()) {
				if (subMap.containsKey(key)) {
					subMap.put(key, subMap.get(key) + 25);
					System.out.println(Thread.currentThread().getName() + " added 25 " + key + ". Current quantity = " + subMap.get(key));
				}
			}
			
		}

	}

	private ArrayList<String> getDepletedProducts() {
		ArrayList<String> list = new ArrayList<>();
		for (TreeMap<String, Integer> subMap : products.values()) {
			for (Entry<String, Integer> e : subMap.entrySet()) {
				if (e.getValue() < MIN_QUANTITY) {
					list.add(e.getKey());
				}
			}
		}
		return list;
	}

	public TreeMap<Product, TreeMap<String, Integer>> getProducts() {
		return products;
	}

	
	
	
}

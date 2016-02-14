package warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import warehouse.Warehousehome.Product;

public class Demo2 {

	private static Warehousehome products = new Warehousehome();

	public static void main(String[] args) {

		Shop shop = new Shop("Fantastiko");
		shop.setName("Fantastiko");
		shop.start();
		Client client1 = new Client("Bai Gosho", shop);
		client1.setName(client1.name);
		Client client2 = new Client("Bai Ivan", shop);
		client2.setName(client2.name);
		Client client3 = new Client("Bai Nasko", shop);
		client3.setName(client3.name);
		client1.start();
		client2.start();
		client3.start();
		
		Shop shop2 = new Shop("Lidl");
		shop2.setName("Lidl");
		shop2.start();
		Client client4 = new Client("Komshito", shop2);
		client4.setName(client4.name);
		Client client5 = new Client("Jenata na komshito", shop2);
		client5.setName(client5.name);
		Client client6 = new Client("Sina na komshito", shop2);
		client6.setName(client6.name);
		client4.start();
		client5.start();
		client6.start();
		
		Shop shop3 = new Shop("Baba Qga");
		shop3.setName("Baba Qga");
		shop3.start();
		Client client7 = new Client("Edin ot Sofia", shop);
		client7.setName(client7.name);
		Client client8 = new Client("Edin ot Petrich", shop);
		client8.setName(client8.name);
		Client client9 = new Client("Vliubena dvoika", shop);
		client9.setName(client9.name);
		client7.start();
		client8.start();
		client9.start();
		
		Thread suplier = new Suplier("DOSTAVKI OOD");
		suplier.setName("DOSTAVKI OOD");
		suplier.start();

	}

	private static class Shop extends Thread {

		private String name;
		private TreeMap<Product, TreeMap<String, Integer>> productsInShop;

		public Shop(String name) {
			this.name = name;
			productsInShop = new TreeMap<Product, TreeMap<String, Integer>>();
			productsInShop.put(Product.VEGETABLES, new TreeMap<String, Integer>());
			productsInShop.get(Product.VEGETABLES).put("Tomato", 0);
			productsInShop.get(Product.VEGETABLES).put("Potato", 0);
			productsInShop.get(Product.VEGETABLES).put("Cucumber", 0);
			productsInShop.put(Product.FRUITS, new TreeMap<String, Integer>());
			productsInShop.get(Product.FRUITS).put("Orange", 0);
			productsInShop.get(Product.FRUITS).put("Apple", 0);
			productsInShop.get(Product.FRUITS).put("Banana", 0);
			productsInShop.put(Product.MEAT, new TreeMap<String, Integer>());
			productsInShop.get(Product.MEAT).put("Beaf", 0);
			productsInShop.get(Product.MEAT).put("Chiken", 0);
			productsInShop.get(Product.MEAT).put("Pork", 0);
		}

		public synchronized void addProduct(String name) {
			for (TreeMap<String, Integer> subMap : productsInShop.values()) {
				if (subMap.containsKey(name)) {
					subMap.put(name, subMap.get(name) + 5);
					System.out.println(
							this.name + " added 5 " + name + " in the shop. Current quantity in the shop = " + subMap.get(name));
				}
			}
			notifyAll();
		}

		public synchronized void sellProduct(String product) {
			if (hasProductInWarehouse(product)) {
				Random r = new Random();
				for (TreeMap<String, Integer> entry : productsInShop.values()) {
					if (entry.containsKey(product)) {
						int quantity = r.nextInt(4) + 1;
						entry.put(product, entry.get(product) - quantity);
						System.out.println(Thread.currentThread().getName() + " take " + quantity + " " + product + " from " + this.name + ". Current quantity = "
								+ entry.get(product));
					}
				}
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

		private boolean hasProductInWarehouse(String product) {
			for (TreeMap<String, Integer> entry : productsInShop.values()) {
				if (entry.containsKey(product) && entry.get(product) >= 4) {
					return true;
				}
			}
			return false;
		}

		@Override
		public void run() {
			Random rand = new Random();
			List<String> stocks = new ArrayList<String>();
			for (TreeMap<String, Integer> e : productsInShop.values()) {
				for (Entry<String, Integer> entry : e.entrySet()) {
					stocks.add(entry.getKey());
				}
			}

			while (true) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String product = stocks.get(rand.nextInt(9));
				products.getProduct(product);
				addProduct(product);
			}

		}
	}

	private static class Client extends Thread {

		private String name;
		private Shop shop;

		public Client(String name, Shop shop) {
			super();
			this.name = name;
			this.shop = shop;
		}

		@Override
		public void run() {
			Random rand = new Random();
			List<String> stocks = new ArrayList<String>();
			for (TreeMap<String, Integer> e : products.getProducts().values()) {
				for (Entry<String, Integer> entry : e.entrySet()) {
					stocks.add(entry.getKey());
				}
			}

			while (true) {
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String product = stocks.get(rand.nextInt(9));
				shop.sellProduct(product);
			}

		}
	}

	private static class Suplier extends Thread {

		private String name;

		public Suplier(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				products.suply();
			}
		}
	}
}

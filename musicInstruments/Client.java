package musicInstruments;

import java.util.List;
import java.util.Random;

public class Client implements Runnable {

	private String name;
	private Shop shop;
	private List<MusicInstrument> instruments;

	public Client(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
		instruments = shop.getAllInstrumentsAlphabetically();
	}

	public void buyProduct(String name, int quantity) throws InterruptedException {
		shop.sellProduct(name, quantity);
	}

	@Override
	public void run() {
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int index = r.nextInt(instruments.size());
			int quantity = r.nextInt(3) + 1;
			String name = instruments.get(index).getName();
			if (shop.hasProductInShop(name, quantity)) {
				try {
					buyProduct(instruments.get(index).getName(), quantity);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Client " + this.name + " bougth " + quantity + " " + name);
			}
			else {
				System.out.println("Sorry. There isnt " + quantity + " " + name + " at the moment.");
			}
		}
	}

}

package musicInstruments;

import java.util.List;
import java.util.Random;


public class Suplier implements Runnable{

	private String name;
	private Shop shop;
	private List<MusicInstrument> instruments;
	
	public Suplier(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
		instruments = shop.getAllInstrumentsAlphabetically();
		
	}
	
	public int getDeliveryTime(String name) {
		return shop.getDeliveryTimeOfInstrument(name);
	}
	
	public void suply(String name, int quantity) throws InterruptedException {
		Thread.sleep(shop.getDeliveryTimeOfInstrument(name));
		shop.suply(name, quantity);
	}


	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				int index = r.nextInt(instruments.size());
				int quantity = r.nextInt(5) + 1;
				String name = instruments.get(index).getName();
				suply(instruments.get(index).getName(), quantity);
				System.out.println("Suplier " + this.name + " suplied " + quantity + " " + name);
			} catch (InterruptedException e) {
				System.out.println("Thread was interupted.");
			}
		}
	}
	
	
}

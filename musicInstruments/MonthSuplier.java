package musicInstruments;

import java.util.List;
import java.util.Random;

public class MonthSuplier implements Runnable {
	private Shop shop;
	private String name;

	public MonthSuplier(String name, Shop shop) {
		this.name = name;
		this.shop = shop;
	}
	
	public void suply() throws InterruptedException {
		List<String> missingInstruments = shop.getMissingInstruments();
		Random r = new Random();
		
		if (!missingInstruments.isEmpty()) {
			System.out.println(name + " made month suply.");
			for (String name : missingInstruments) {
				Thread.sleep(shop.getDeliveryTimeOfInstrument(name));
				int quantity = r.nextInt(5) + 1;
				shop.monthSuply(name, quantity);
				System.out.println("\tSuplied " + quantity + " " + name);
			}
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				suply();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

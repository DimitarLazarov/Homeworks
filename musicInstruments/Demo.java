package musicInstruments;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		
//		TreeMap<TypeOfInstrument, ArrayList<MusicInstrument>> map = shop.getCatalogOfShop();
//		System.out.println(map);
//		List<MusicInstrument> list = shop.getAllInstrumentsAlphabetically();
//		System.out.println(list);

		//shop.sellProduct("Daire", 3);
		//shop.suply("Daire", 20);
		//List<MusicInstrument> list = shop.getAllInstrumentInTheShopAtTheMoment();
		//System.out.println(list);
		
		//shop.sellProduct("Daire", 2);
		//shop.sellProduct("Typan", 2);
		//shop.sellProduct("Cigulka", 1);
//		System.out.println(shop.getMoney());
//		shop.sellProduct("Daire", 1);
		shop.showInfoMostMakingCashType();
		
		Thread thread = new Thread(new Suplier("Gosho", shop));
		thread.start();
		Thread thread1 = new Thread(new Client("Bai Ivan", shop));
		thread1.start();
		Thread thread2 = new Thread(new Client("Bai Stoqn", shop));
		thread2.start();
		Thread thread3 = new Thread(new MonthSuplier("Month deliver", shop));
		thread3.start();
		
		List<MusicInstrument> list = shop.getAllInstrumentInTheShopAtTheMoment();
		System.out.println(list);
		
		
	}
}

package musicInstruments;

public class MusicInstrument {

	private String name;
	private int price;
	private int delirveryTime;
	
	public MusicInstrument(String name, int price, int deliveryTime) {
		this.name = name;
		this.price = price;
		this.delirveryTime = deliveryTime;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getDelirveryTime() {
		return delirveryTime;
	}
	
	@Override
	public String toString() {
		return name + " " + price + "lv";
	}
}


public class Demo {
	
	public static void main(String[] args) {
		
		Computer pc1 = new Computer();
		Computer pc2 = new Computer(2012, 985.4, 76005.8, 50353.6);
		Computer pc3 = new Computer(2010, 863.5, 46509.3, 30023);
		Computer pc4 = new Computer(2014, 933.5, 24509.3, 18023);
		int compare = pc2.comparePrice(pc3);
		if (compare == -1) {
			System.out.println("pc2 is more expencive than pc3");
		}
		else if (compare == 1) {
			System.out.println("pc2 is cheaper than pc3");
		}
		else {
			System.out.println("The price of pc2 and pc3 is the same");
		}
		int compare2 = pc3.comparePrice(pc4);
		if (compare2 == -1) {
			System.out.println("pc3 is more expencive than pc4");
		}
		else if (compare2 == 1) {
			System.out.println("pc3 is cheaper than pc4");
		}
		else {
			System.out.println("The price of pc3 and pc4 is the same");
		}
	}
}

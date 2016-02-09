
public class NewDemo {

	public static void main(String[] args) {
		
		Call call = new Call();
		Call.priceForAMinute = 2;
		
		GSM samsung = new GSM();
		GSM nokia = new GSM();
		samsung.model = "Samsung";
		nokia.model = "Nokia";
		samsung.insertSimCard("0895611642");
		nokia.insertSimCard("0896547867");
		samsung.call(nokia, 3);
		samsung.printInfoForTheLastOutgoingCall();
		nokia.printInfoForTheLastIncomingCall();
		System.out.println(samsung.getSumForCalls());
	}
}


public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outGoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutGoingCall;
	
	void insertSimCard(String simMobileNumber) {

		if ((simMobileNumber.charAt(0) == '0') && (simMobileNumber.charAt(1) == '8') &&
			(simMobileNumber.length() == 10)) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
	}
	
	void removeSimCard(){
		if (hasSimCard) {
			this.hasSimCard = false;
		}
	}
	
	void call(GSM receiver, int duration) {
		if (duration > 0) {
			if (this.hasSimCard && receiver.hasSimCard) {
				if (!(this.simMobileNumber.equals(receiver.simMobileNumber))) {
					this.lastOutGoingCall = new Call();
					this.lastOutGoingCall.duration = duration;
					this.lastOutGoingCall.caller = this.simMobileNumber;
					this.lastOutGoingCall.receiver = receiver.simMobileNumber;
					receiver.lastIncomingCall = new Call();
					receiver.lastIncomingCall.duration = duration;
					receiver.lastIncomingCall.caller = this.simMobileNumber;
					receiver.lastIncomingCall.receiver = receiver.simMobileNumber;
					this.outGoingCallsDuration += duration;
				}
			}
		}
	}
	
	int getSumForCalls() {
		return this.outGoingCallsDuration * Call.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall() {
		if (lastOutGoingCall != null) {
			System.out.println("Last outgoing call");
			System.out.println("The caller is " + lastOutGoingCall.caller);
			System.out.println("The receiver is " + lastOutGoingCall.receiver);
		}
	}
	
	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null) {
			System.out.println("Last incoming call");
			System.out.println("The caller is " + lastIncomingCall.caller);
			System.out.println("The receiver is " + lastIncomingCall.receiver);
		}
	}
}

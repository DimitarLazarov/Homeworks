package bank;

public class Deposit extends BankProduct {
	
	
	public Deposit(String name, double yearPercent, int periodMonths, double money) {
		super(name, yearPercent, periodMonths, money);
		
	}
	
	
	private double calculateMoneyToPay() {
		return getMoney() * getYearPercent() / 100;
	}


	@Override
	public void payment() {
		
	}


	@Override
	public double payLihva() {
		double moneyToPay = calculateMoneyToPay();
		setMoney(moneyToPay);
		return moneyToPay;
	}

	@Override
	public String toString() {
		return String.format("%s %.2f %d %.2f", getName(), getYearPercent(), getPeriodMonths(), getMoney());
		//return getName() + " " + getYearPercent() + " " + getPeriodMonths() + " " + getMoney();
	}

	
}

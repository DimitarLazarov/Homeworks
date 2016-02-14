package bank;

public class Credit extends BankProduct {
	
	private double monthTransaction;

	public Credit(String name, double yearPercent, int periodMonths, double money) {
		super(name, yearPercent, periodMonths, money * -1);
		monthTransaction = (money + (( money * yearPercent / 100))) / periodMonths;
		
	}

	@Override
	public void payment() {
		setMoney(monthTransaction);
	}

	@Override
	public double payLihva() {
		return 0;
	}

	
	public double getMonthTransaction() {
		return monthTransaction;
	}
	
	@Override
	public String toString() {
		return String.format("%s %.2f %d %.2f", getName(), getYearPercent(), getPeriodMonths(), getMoney());
		//return getName() + " " + getYearPercent() + " " + getPeriodMonths() + " " + getMoney();
	}

}

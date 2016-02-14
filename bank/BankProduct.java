package bank;

public abstract class BankProduct {

	private String name;
	private double yearPercent;
	private int periodMonths;
	private double money;
	
	
	public BankProduct(String name, double yearPercent, int periodMonths, double money) throws IllegalArgumentException {
		this.name = name;
		this.yearPercent = yearPercent;
		this.periodMonths = periodMonths;
		this.money = money;
	}


	public abstract void payment();
	public abstract double payLihva();


	public String getName() {
		return name;
	}

	public int getPeriodMonths() {
		return periodMonths;
	}

	public double getYearPercent() {
		return yearPercent;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = this.money + money;
	}


	

}

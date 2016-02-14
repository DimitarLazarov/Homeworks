package bank;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private String address;
	private double money;
	private double monthSalary;
	private List<Deposit> deposits;
	private List<Credit> credits;
	
	
	public Client(String name, String address, double money, double monthSalary) {
		this.name = name;
		this.address = address;
		this.money = money;
		this.monthSalary = monthSalary;
		deposits = new ArrayList<Deposit>();
		credits = new ArrayList<Credit>();
	}


	public boolean addDeposit(Deposit deposit) {
		if (deposit.getMoney() > money) {
			return false;
		}
		else {
			deposits.add(deposit);
			money = money - deposit.getMoney();
			return true;
		}
		
	}
	
	public double getMonthSalary() {
		return monthSalary;
	}


	public void addCredit(Credit credit) {
		money = money - credit.getMoney();
		credits.add(credit);
	}
	
	public void takeCredit(Bank bank, Credit credit) throws NotEnoughMoneyInBankException, NotEnoughSalaryException {
		double allMonthPayments = 0;
		for(Credit cr : credits) {
			allMonthPayments += cr.getMonthTransaction();
		}
		if (allMonthPayments < (monthSalary / 2)) {
			bank.giveCredit(this, credit);
		}
		else {
			System.out.println("You have too much credits!");
		}
	}
	
	public void putDeposit(Bank bank, Deposit deposit) {
		if (money > 0 && money > deposit.getMoney())
			bank.takeDeposit(this, deposit);
		else 
			System.out.println("Sorry, you dont have money to deposit.");
	}
	
	public void makeMonthPayment() {
		for (Credit credit : credits) {
			money = money - credit.getMonthTransaction();
			credit.payment();
		}
	}
	
	public double getMoney(){
		return money;
	}


	public String getName() {
		return name;
	}
}

package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private String address;
	private double money;
	private double reserve;
	private List<BankProduct> products;
	
	
	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
		money = 0;
		reserve = 0;
		products = new ArrayList<BankProduct>();
	}
	
	public void takeDeposit(Client client, Deposit deposit) {
		if(client.addDeposit(deposit)) {
			money = money + deposit.getMoney();
			reserve = reserve + (deposit.getMoney() * 90 / 100);
			products.add(deposit);
		}
		
	}
	
	public void payLihva() {
		for(BankProduct product : products) {
			double moneyRemoveBank = product.payLihva();
			money = money - moneyRemoveBank;
		}
	}
	
	public void giveCredit(Client client, Credit credit) throws NotEnoughMoneyInBankException, NotEnoughSalaryException {
		if (credit.getMoney() * -1 > reserve) {
			throw new NotEnoughMoneyInBankException();
		}
		if (client.getMonthSalary() < credit.getMonthTransaction()) {
			throw new NotEnoughSalaryException();
		}
		double allDepositsMoney = 0;
		for(BankProduct product : products) {
			if (product instanceof Deposit) {
				allDepositsMoney += product.getMoney();
			}
		}
		if ((money - credit.getMoney()) > (allDepositsMoney / 10)) {
			money = money + credit.getMoney();
			reserve = reserve + credit.getMoney();
			client.addCredit(credit);
			products.add(credit);
		}
		else {
			System.out.println("The bank cant give credit right now!");
		}
	}
	
	public double getMoney(){
		return money;
	}
	
	public double getReserve() {
		return reserve;
	}
	
	public void showProducts() {
		for(BankProduct product : products) {
			System.out.println(product);
		}
	}
}

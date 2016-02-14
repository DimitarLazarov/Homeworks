package bank;

import java.util.ArrayList;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		Deposit shortDeposit = new Deposit("short", 3.0, 3, 10000);
		Deposit longDeposit = new Deposit("long", 5.0, 12, 20000);
		Credit homeCredit;
		Credit consumerCredit;
		try {
			homeCredit = new Credit("home", 6.0, 24, -10000);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Credits must be with -money");
		}
		try {
			consumerCredit = new Credit("consumer", 10.0, 36, -40000);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Credits must be with -money");
		}
		
		Bank dsk = new Bank("DSK", "Sofia");
		Client client1 = new Client("Pesho", "Petrich", 6000, 600);
		Client client2 = new Client("Gosho", "Sofia", 7000, 800);
		Client client3 = new Client("Ivan", "Tyrnovo", 9000, 500);
		Client client4 = new Client("Stoqn", "Plovdiv", 16000, 1000);
		Client client5 = new Client("Mitko", "Varna", 11000, 1200);
		Client client6 = new Client("Dancho", "Burgas", 8000, 550);
		Client client7 = new Client("Sasho", "Ruse", 19000, 1600);
		Client client8 = new Client("Kosio", "Stara zagora", 26000, 2000);
		Client client9 = new Client("Mario", "Yambol", 17000, 1700);
		Client client10 = new Client("Dragan", "Sliven", 4000, 600);
		ArrayList<Client> listOfClients = new ArrayList<Client>();
		listOfClients.add(client1);
		listOfClients.add(client2);
		listOfClients.add(client3);
		listOfClients.add(client4);
		listOfClients.add(client5);
		listOfClients.add(client6);
		listOfClients.add(client7);
		listOfClients.add(client8);
		listOfClients.add(client9);
		listOfClients.add(client10);
		
		Random rand = new Random();
		
		for (Client client : listOfClients) {
			client.putDeposit(dsk, new Deposit("Deposit of " + client.getName(), rand.nextDouble() * 5, rand.nextInt(25), ((rand.nextInt(20) + 80) * client.getMoney() / 100)));
		}
		System.out.println(dsk.getMoney());
		System.out.println(dsk.getReserve());
		for (Client client : listOfClients) {
			try {
				client.takeCredit(dsk, new Credit("Credit of " + client.getName() , (rand.nextDouble() * 5) + 3, rand.nextInt(25), 5000 + rand.nextInt(5000)));
			} catch (NotEnoughMoneyInBankException e) {
				System.out.println("The bank has not enough money");
			} catch (NotEnoughSalaryException e) {
				System.out.println("Client cant pay this credit.");
			} 
		}
//		System.out.println(dsk.getMoney());
//		dsk.showProducts();
//		System.out.println("------------------------------");
//		System.out.println(dsk.getMoney());
//		dsk.payLihva();
//		System.out.println(dsk.getMoney());
//		System.out.println("------------------------------");
		dsk.showProducts();
//		System.out.println(dsk.getMoney());
//		System.out.println(dsk.getReserve());
		
		client1.makeMonthPayment();
		
		dsk.showProducts();
		
	}
}

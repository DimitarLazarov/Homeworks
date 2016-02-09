
public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory");
		} else {
			freeMemory -= memory;
		}
	}

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	int comparePrice(Computer computer) {
		if (this.price > computer.price) {
			return -1;
		} else if (this.price < computer.price) {
			return 1;
		} else
			return 0;
	}

}

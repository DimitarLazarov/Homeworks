
public class Demo {

	public static void main(String[] args) {

		Scheduler scheduler = new Scheduler();
		scheduler.push(new Task() {

			@Override
			public void doWork() {
				System.out.println("Working like a doctor");
			}
		});

		scheduler.push(() -> System.out.println("Working like a driver"));
		scheduler.push(() -> System.out.println("Working like a programmer! haha"));
		scheduler.push(new Task() {

			@Override
			public void doWork() {
				System.out.println("Another inner class with no work here!");

			}
		});
		scheduler.push(() -> System.out.println("Now i like work with lambda expressions! Niceee"));
		scheduler.startWork();
	}
}

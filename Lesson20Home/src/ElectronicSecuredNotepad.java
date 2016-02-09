
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;

	public ElectronicSecuredNotepad(int pages) {
		super(pages);
		isStarted = false;
	}

	@Override
	public void start() {
		if (checkPassword())
			isStarted = true;

	}

	@Override
	public void stop() {
		if (checkPassword())
			isStarted = false;

	}

	@Override
	public boolean isStarted() {
		if (isStarted){
		return isStarted;
		}
		System.out.println("The device is off. Switch on the device");
		return false;
	}

	public void addText(int number, String text) {
		if (this.isStarted()) {
			super.addText(number, text);
		}
	}

	public void addNextText(int number, String text) {
		if (this.isStarted()) {
			super.addNextText(number, text);
		}
	}

	public void deleteText(Page page) {
		if (this.isStarted()) {
			super.deleteText(page);
		}
	}
	
	public void printAllPages() {
		if (this.isStarted()) {
			super.printAllPages();
		}
	}
}

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad  {
	
	private String password;
	
	public SecuredNotepad(int pages){
		super(pages);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert STRONG password");
		String pass = scanner.nextLine();
		if(isStrongpass(pass)){
			this.password = pass;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public void addText(int number, String text) {
		
		if (checkPassword()) {
			super.addText(number, text);
		}
		
	}
	
	public void addNextText(int number, String text) {
		if (checkPassword()) {
			super.addNextText(number, text);
		}
	}
	
	public void deleteText(Page page) {
		if (checkPassword()) {
			super.deleteText(page);
		}
		
	}
	
	public void printAllPages() {
		if (checkPassword()) {
			super.printAllPages();
		}
		
	}
	
	private boolean isStrongpass(String pass) {
		boolean length = pass.length() >= 5;
		boolean digit = false;
		boolean lowerCase = false;
		boolean upCase = false;
		
		for (int i = 0; i < pass.toCharArray().length; i++) {
			if(pass.toCharArray()[i] > '0' && pass.toCharArray()[i] < '9') {
				digit = true;
			}
			if(pass.toCharArray()[i] > 'a' && pass.toCharArray()[i] < 'z') {
				lowerCase = true;
			}
			if(pass.toCharArray()[i] > 'A' && pass.toCharArray()[i] < 'Z') {
				upCase = true;
			}
		}
		return length && digit && lowerCase && upCase;
	}
	
	protected boolean checkPassword() {
		System.out.println("Please insert password ");
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		if (password.equals(this.password)) {
			return true;
		}
		System.out.println("Sorry, bro, wrong pass");
		return false;
	}
}

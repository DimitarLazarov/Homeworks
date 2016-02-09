
public class SimpleNotepad implements INotepad {

	private Page[] pages;

	public SimpleNotepad(int pages) {
		this.pages = new Page[pages];
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page("Page " + (i+1) , "");
		}
	}

	@Override
	public void addText(int number, String text) {
		if (validatePageNumber(number)) {
			pages[number-1].addText(text);
		}

	}

	@Override
	public void addNextText(int number, String text) {
		if (validatePageNumber(number)) {
			pages[number-1].deleteText();
			pages[number-1].addText(text);
		}

	}

	@Override
	public void deleteText(Page page) {
		page.deleteText();
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println(pages[i].showInfo());
		}

	}

	boolean validatePageNumber(int number) {
		if (number > 0 && number <= pages.length)
			return true;
		System.out.println("There is no page with this number");
		return false;
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigit()) {
				System.out.println(pages[i].showInfo());
			}

		}

	}

}

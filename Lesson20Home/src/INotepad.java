
public interface INotepad {

	void addText(int number, String text);
	void addNextText(int number, String text);
	void deleteText(Page page);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}

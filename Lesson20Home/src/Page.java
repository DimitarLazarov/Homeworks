
public class Page {

	private String title;
	private String text;

	public Page() {
		title = "no title";
		text = "";
	}

	public Page(String title, String text) {
		this.title = title;
		if (text != null) {
			this.text = text;
		} else {
			this.text = "";
		}
	}

	public void addText(String text) {
		this.text = this.text + text;
	}

	public void deleteText() {
		this.text = "";
	}

	public String showInfo() {
		return title + "\n" + text;
	}

	public boolean searchWord(String word) {
		if (text.toLowerCase().indexOf(word.toLowerCase()) != -1) {
			return true;
		}
		return false;
	}

	public boolean containsDigit() {
		char[] tmp = text.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] >= '0' && tmp[i] <= '9') {
				return true;
			}
		}
		return false;
	}
}

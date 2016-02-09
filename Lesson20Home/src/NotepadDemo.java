
public class NotepadDemo {

	public static void main(String[] args) {
		
		/*SimpleNotepad notepad = new SimpleNotepad(10);
		SecuredNotepad snotepad = new SecuredNotepad(5, "12345");
		notepad.addNextText(1, "First lesson");
		notepad.addNextText(2, "Second lesson");
		notepad.printAllPages();
		snotepad.addText(3, "pes3hkoo");
		snotepad.addNextText(6, "gos2hkoo");
		snotepad.printAllPages();*/
		
		ElectronicSecuredNotepad note = new ElectronicSecuredNotepad(9);
		note.start();
		note.addNextText(3, "haha text");
		note.printAllPages();
		
		
		
		
	}
}

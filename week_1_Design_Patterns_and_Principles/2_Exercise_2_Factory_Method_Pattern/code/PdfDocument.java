

public class PdfDocument implements Document{
	public void open() {
		System.out.println("Opening Pdf Document");
	}
	public void save() {
		System.out.println("Saving Pdf Document");
	}
	public void close() {
		System.out.println("Closing Pdf Document");
	}
}

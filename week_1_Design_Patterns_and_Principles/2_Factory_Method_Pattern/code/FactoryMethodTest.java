

public class FactoryMethodTest {
	public static void main(String[] args) {
		//creating word Document
		DocumentFactory wordFactory = new WordDocumentFactory();
		Document wordDoc = wordFactory.createDocument();
		wordDoc.open();
		wordDoc.save();
		wordDoc.close();
		
		// Creating PDF Document
		DocumentFactory PdfFactory = new PdfDocumentFactory();
		Document PdfDoc = PdfFactory.createDocument();
		PdfDoc.open();
		PdfDoc.save();
		PdfDoc.close();
		
		// Creating Excel Document
		DocumentFactory ExcelFactory = new ExcelDocumentFactory();
		Document ExcelDoc = ExcelFactory.createDocument();
		ExcelDoc.open();
		ExcelDoc.save();
		ExcelDoc.close();
	}
}

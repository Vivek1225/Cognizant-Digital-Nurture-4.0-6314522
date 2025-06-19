package Design_Patterns_and_Principles.Factory_Method_Pattern;

//PdfDocumentFactory.java
public class PdfDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new PdfDocument();
 }
}

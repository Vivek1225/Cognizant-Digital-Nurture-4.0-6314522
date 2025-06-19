package Design_Patterns_and_Principles.Factory_Method_Pattern;

public class ExcelDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new ExcelDocument();
 }
}
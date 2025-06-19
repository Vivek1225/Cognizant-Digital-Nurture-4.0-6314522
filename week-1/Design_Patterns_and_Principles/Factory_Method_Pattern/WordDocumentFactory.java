package Design_Patterns_and_Principles.Factory_Method_Pattern;

//WordDocumentFactory.java
public class WordDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new WordDocument();
 }
}

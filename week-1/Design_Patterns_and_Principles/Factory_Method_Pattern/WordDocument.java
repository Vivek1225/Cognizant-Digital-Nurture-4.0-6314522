package Design_Patterns_and_Principles.Factory_Method_Pattern;

public class WordDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Word Document");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Saving Word Document");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing word Document");
	}

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();
        
        // Log messages
        logger.log("This is the first log message.");
        logger.log("This is the second log message.");
        
        // Verify that the same instance is used
        Logger anotherLogger = Logger.getInstance();
        System.out.println("Are both logger instances the same? " + (logger == anotherLogger));
	}

}

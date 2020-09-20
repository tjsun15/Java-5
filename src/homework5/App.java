package homework5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log("Hello");
		
		asteriskLogger.error("Stop");
	
		///////////////////////////////////////////////////////////////////////
		// spacedLogger
		Logger spacedLogger2 = new SpacedLogger();
		
		spacedLogger2.log("Sunny");
		
		spacedLogger2.error("Money");
		
		
		
		//Other way
		
		
		/*AsteriskLogger log1 = new AsteriskLogger();
		log1.log("Hello");
		
		
		AsteriskLogger error1 = new AsteriskLogger();
		error1.error("Stop");
		
		SpacedLogger log2 = new SpacedLogger();
		log2.log("Sunny");
		
		SpacedLogger error2 = new SpacedLogger();
		error2.error("Money");*/
		
	}

}

package homework5;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		
	    System.out.println(String.valueOf(log).replaceAll(".(?!$)", "$0  "));
		
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR: " +  String.valueOf(error).replaceAll(".(?!$)", "$0  "));
		
	}

}

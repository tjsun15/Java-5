package homework5;

public class AsteriskLogger implements Logger{

	/*The error method on the AsteriskLogger should print the String it receives inside a box of 
	 * asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the 
	 * argument, the following should be printed:
	 * 
	 *   *******************
	 *   ***Error: ***
	 */
	
	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		
		String asteriskString = "*************";
		for (int i = 0; i < error.length(); i++) {
			asteriskString += "*";
			// Use a StringBuilder
		}
		
		System.out.println(asteriskString);
		System.out.println("***ERROR: " + error + "***");
		System.out.println(asteriskString);
	}

}

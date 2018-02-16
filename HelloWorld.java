import java.util.Scanner;

/*
 * 	Author: Ghilman Anjum
 * 	Usage: This class is responsible for displaying a line on console
 * 	Known Issues: None
 */

public class HelloWorld {
	/***************************************************************
		MAIN - METHOD
	 ****************************************************************/
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner (System.in);
		String myStatement = myScanner.nextLine();
		printMethod(myStatement);

	}
	
	/***************************************************************
		PUBLIC - METHODS
	 ****************************************************************/

	/*
	 * 	@Usage Method printMethod is displaying a statement on console
	 * 	@param aStatement This is the statement which is to be displayed on console
	 */
	
	public static void printMethod (String aStatement){
		System.out.println(aStatement);
	}
	
} //end of class

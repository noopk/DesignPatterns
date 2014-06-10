/**
 * Test of Log singleton class
 *
 * @author anupkhadka
 */

package singleton;

public class SingletonTest {

	public static void main(String [] args) {
		Log log1 = Log.getInstance();
		log1.addToLog("First log\n");
		Log log2 = Log.getInstance();
		log2.addToLog("Second log\n");
		Log log3 = Log.getInstance();
		log3.addToLog("Third log\n");
		
		//This should print the entire log
		log3.printLog();
	}
}

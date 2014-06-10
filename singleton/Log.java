/**
 * This class implements a Log object. 
 * Log uses singleton pattern so that there is only one
 * instance of Log. The same instance of Log will be used
 * by all other objects to log their results
 *
 * @author anupkhadka
 */

package singleton;

public class Log {
	private static Log logInstance = null;
	private String log;

	/* Private constructor, because we don't invoke it */
	private Log() {
		log = new String();
	}

	public void addToLog(String text) {
		this.log += text;	
	}

	public void printLog() {
		System.out.println(log);
	}

	public static Log getInstance() {
		if(logInstance == null) {
			logInstance = new Log();
		}
		return logInstance;
	}
}

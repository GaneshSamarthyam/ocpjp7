public class Logger {
	private Logger() {
		// private constructor
	}
	public static Logger myInstance;
	public static Logger getInstance() {
		if(myInstance == null) {
			synchronized (Logger.class) {
				myInstance = new Logger();
			}
		}			
		return myInstance;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}

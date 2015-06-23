class ThreadStateProblem extends Thread {
	public void run() {
		try {
			wait(1000);
		}
		catch(InterruptedException ie) {
			// its okay to ignore this exception since we’re not 
			// interrupting exceptions in this code 
			ie.printStackTrace(); 
		}
	}
	
	public static void main(String []s) {
		new ThreadStateProblem().start(); 
	}
} 

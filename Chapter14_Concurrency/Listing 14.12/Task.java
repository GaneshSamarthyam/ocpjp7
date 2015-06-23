import java.util.concurrent.*;

// This Task class implements Runnable, so its a Thread object 
class Task implements Runnable {
	public void run() {
		System.out.println("Calling Task.run() "); 
	}
}

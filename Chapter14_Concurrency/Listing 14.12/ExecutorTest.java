// This class spawns a Task thread and explicitly calls start() method. 
// It also shows how to execute a Thread using Executor 
class ExecutorTest {
	public static void main(String []args) {
		Runnable runnable = new Task(); 
		System.out.println("Calling Task.run() by directly creating a Thread object");
		Thread thread = new Thread(runnable); 
		thread.start();
		RepeatedExecutor executor = new RepeatedExecutor();
		executor.execute(runnable, 3); 	
	}
}

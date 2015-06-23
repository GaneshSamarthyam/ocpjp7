class UseCounter implements Runnable {
	public static void increment() { 
		Counter.count++;
		System.out.print(Counter.count + "  ");
	}
	public void run() {
		increment();
         	increment();
		increment(); 
	}
}

class ThreadStateProblem {
	public static void main(String []s) {
		Thread thread = new Thread();
		thread.start();
		thread.start();
	}
}


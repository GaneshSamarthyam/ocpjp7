// This thread simulates arrival of a player. 
// Once a player arrives, he/she should wait for other players to arrive 
class Player extends Thread {
	CyclicBarrier waitPoint; 
	public Player(CyclicBarrier barrier, String name) { 
		this.setName(name);
waitPoint = barrier; 
		this.start(); 
		}
	public void run() {
		System.out.println("Player " + getName() + " is ready ");
		try { 
			waitPoint.await(); // await for all four players to arrive 
		} catch(BrokenBarrierException | InterruptedException exception) {
			System.out.println("An exception occurred while waiting... " + exception); 
		}
	}
}


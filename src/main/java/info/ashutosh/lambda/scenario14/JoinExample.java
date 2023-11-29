package info.ashutosh.lambda.scenario14;

public class JoinExample {

	public static void main(String[] args) {
		Thread workerA = new Thread(new MyThreadWork(4));
		workerA.setName("Thread-A");

		Thread workerB = new Thread(new MyThreadWork());
		workerB.setName("Thread-B");

		workerA.start(); // Worker A starts
		try {
			workerA.join(); // Wait for Worker A to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workerB.start(); // Worker B starts after Worker A finishes
	}
}

class MyThreadWork implements Runnable {

	private int workTime = 0;

	public MyThreadWork() {
		workTime = 3;
	}

	public MyThreadWork(int workTime) {
		super();
		this.workTime = workTime;
	}

	@Override
	public void run() {

		System.out.print("Worker " + Thread.currentThread().getName() + " is working");

		for (int i = 0; i < workTime; i++) {
			try {
				System.out.print(".");
				Thread.sleep(1000); // Every Thread takes 2 seconds to finish
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("Worker " + Thread.currentThread().getName() + " has finished.");
	}

}

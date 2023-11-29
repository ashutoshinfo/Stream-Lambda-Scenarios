package info.ashutosh.lambda.scenario14;

public class WaitExample {

	public static void main(String[] args) {
		final Object lock = new Object(); // An object to use as a lock

		Thread waiter = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Waiter: I'm waiting for a notification...");
				try {
					lock.wait(); // Wait until another thread calls lock.notify()
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Waiter: I received a notification and can continue.");
			}
		});

		Thread notifier = new Thread(() -> {
			try {
				Thread.sleep(2000); // Simulate some work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (lock) {
				System.out.println("Notifier: I'm notifying the waiter.");
				lock.notify(); // Notify the waiting thread (waiter)
			}
		});

		waiter.start(); // Start the waiter thread
		notifier.start(); // Start the notifier thread
	}
}

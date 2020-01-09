package multithreading;

public class App {
	public int c = 0;
	
	public synchronized void inc() {
		c++;	
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.doWork();
	}
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					inc();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					inc();
				}
			}
		});
		
		t1.start();
		t2.start();
		System.out.println(c);
	}
	
}

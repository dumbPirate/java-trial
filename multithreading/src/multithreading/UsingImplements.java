package multithreading;


class Runners implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println(i);
//			inc();
			
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Trul implements Runnable{
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println(i*i);
//			inc();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//public class UsingImplemen {
//	public int t = 0;
//	public synchronized void inc() {
//		t++;
//	}
//}

public class UsingImplements {
	public static void main(String[] args) {
		
		public synchronized void inc() {
			
		}
		
		Thread t1 = new Thread(new Runners());
		Thread t2 = new Thread(new Trul());
		
		t1.start();
		t2.start();
	}
}

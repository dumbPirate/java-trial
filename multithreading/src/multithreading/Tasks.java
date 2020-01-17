package multithreading;


class Task1 implements Runnable{
	public void run() {
		System.out.print("1 start\n");
		for(int i = 101; i<199; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n 1 done");
	}
}

class Task2 extends Thread{
	public void run() {
		System.out.print("\n2 start\n");
		for(int i = 201; i<299; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n 2 done");
	}
}

public class Tasks {
	public static void main(String[] args) {
		System.out.print("\n1 kick\n");
		Task1 task1 = new Task1();
		Thread t1thread = new Thread(task1);
		t1thread.start();
		
		System.out.print("\n2 kick\n");
		Task2 task2 = new Task2();
		task2.start();
		
		System.out.print("\n3 kick\n");
		for(int i = 301; i<399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n 3 done");
		
		System.out.println("main done");
	}

}



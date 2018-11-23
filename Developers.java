package mutltithreadingDemo.CountdownlatchExample;

import java.util.concurrent.CountDownLatch;

public class Developers extends Thread {

	private CountDownLatch countDownLatch;

	public Developers(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(Thread.currentThread().getName() + "is working");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "has completed the task");

			try {
				countDownLatch.countDown();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

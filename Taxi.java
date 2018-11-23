package mutltithreadingDemo.cyclicBarrierExample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Taxi extends Thread {

	CyclicBarrier barrier;
	public Taxi(String name,CyclicBarrier barrier) {
		super(name);
		this.barrier = barrier;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"has come ");
		
		try {
			if(barrier.await()==0){
				System.out.println("Taxi is going to start");
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (BrokenBarrierException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

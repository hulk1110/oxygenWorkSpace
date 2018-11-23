package mutltithreadingDemo;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
	String name;
	List<Integer> listTobeConsumed = new ArrayList<Integer>();

	public Consumer(String string, List<Integer> listTobeConsumed) {
		super();
		this.name = name;
		this.listTobeConsumed = listTobeConsumed;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				if (listTobeConsumed.size()==0) {
					System.out.println(Thread.currentThread().getName() + "i can't consume empty list");
					try {
						wait();
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("i am consuming now ,  size of list decremented to "+ listTobeConsumed.size());
				int index = 0;
				listTobeConsumed.remove(index);
				System.out.println(Thread.currentThread().getName() + "I am consuming now");
				index--;
				notify();
			
			}
		}
	}
}

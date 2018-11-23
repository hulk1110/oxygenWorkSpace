package mutltithreadingDemo;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	String name;
	int size;

	List<Integer> listTobeProduced = new ArrayList<Integer>();

	public Producer(String name, int size, List<Integer> listTobeProduced) {
		super();
		this.name = name;
		this.size = size;
		this.listTobeProduced = listTobeProduced;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				if (listTobeProduced.size() == size) {
					try {
						System.out.println(Thread.currentThread().getName()
								+ "i am not producing any more as i have filled my capacity");
						wait();
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				notify();
				int i = 0;
				System.out.println(Thread.currentThread().getName() + "i am producing now");
				listTobeProduced.add(i++);
				System.out.println("i am producing now ,  size of list incremented to "+ listTobeProduced.size());
			}
		}
	}

}

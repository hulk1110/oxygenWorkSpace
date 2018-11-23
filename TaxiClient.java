package mutltithreadingDemo.cyclicBarrierExample;

import java.util.concurrent.CyclicBarrier;

public class TaxiClient {

	public static void main(String[] args) {
		CyclicBarrier barrier= new CyclicBarrier(4);
		Taxi taxi1= new Taxi("taxi1",barrier);
		Taxi taxi2= new Taxi("taxi2",barrier);
		Taxi taxi3= new Taxi("taxi3",barrier);
		Taxi taxi4= new Taxi("taxi4",barrier);
		Taxi taxi5= new Taxi("taxi5",barrier);
		Taxi taxi6= new Taxi("taxi6",barrier);
		Taxi taxi7= new Taxi("taxi7",barrier);
		Taxi taxi8= new Taxi("taxi8",barrier);
		
		taxi1.start();
		taxi2.start();
		taxi3.start();
		taxi4.start();
		taxi5.start();
		taxi6.start();
		taxi7.start();
		taxi8.start();
		
	}
}

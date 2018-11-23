package mutltithreadingDemo;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {
public static void main(String[] args) {
	
	
	List<Integer> listOfItems= new ArrayList<>();
	int sizeOfList= 12;
	
	Thread producer= new Thread(new Producer("producer",sizeOfList, listOfItems));
	Thread consumer= new Thread(new Consumer("consumer",listOfItems));
	producer.start();
	consumer.start();
}
}

package mutltithreadingDemo.CountdownlatchExample;

import java.util.concurrent.CountDownLatch;

public class Manager {
public static void main(String[] args) {
	CountDownLatch countDownLatch= new CountDownLatch(2);
	
	Developers developers1= new Developers(countDownLatch,"DEV team1") ;
	Developers developers2= new Developers(countDownLatch,"DEV team2") ;
	developers1.start();
	developers2.start();
	try {
		countDownLatch.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	TestingTeam testingTeam = new TestingTeam("QA team");
	testingTeam.start();
}
}

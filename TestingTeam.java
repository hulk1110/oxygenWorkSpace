package mutltithreadingDemo.CountdownlatchExample;

public class TestingTeam extends Thread{

	public TestingTeam(String string) {
		super(string);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" is working now");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task is finished by QA team");
	}
	
}

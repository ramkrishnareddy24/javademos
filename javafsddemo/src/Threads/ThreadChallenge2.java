package Threads;

public class ThreadChallenge2 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=1;i<10;i++)
				{
					if(i%2==0)
						Utils.printmessage(""+i);
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=1;i<10;i++)
				{
					if(i%2!=0)
						Utils.printmessage(""+i);
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.setName("TEVEN");
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.setName("TODD");
		t2.start();
		
		for(int i=0;i<=10;i++) {
			Utils.printmessage(""+i);
		}
	}
}

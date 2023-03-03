package Threads;

public class ThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setName("T1");
		t.start();
		
		synchronized(t) {
			Utils.printmessage("going to wait");
			t.wait();
			Utils.printmessage("Notified");
			Utils.printmessage("Total = "+mt.total);
		}
	}
}


class MyThread implements Runnable{
	int total;
	
	@Override
	public void run() {
		Utils.printmessage("caclulating sum ");
		synchronized(this) {
			for(int i=0;i<=100;i++) {
				total+=i;
			}
			Utils.printmessage("Calculation completed... Notifying");
			this.notify();
		}
	}
	
	public int getTotal() {
		return total;
	}
}
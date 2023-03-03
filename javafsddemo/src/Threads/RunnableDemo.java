package Threads;

public class RunnableDemo {
	public static void main(String[] args) {
		Utils.printmessage("Begin main");
		
		ImageProcessor ip = new ImageProcessor();
		Thread t = new Thread(ip);
		t.start();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Utils.printmessage("DO some work");
			}
		});
	}
}

class ImageProcessor implements Runnable{
	@Override
	public void run() {
		Utils.printmessage("Processing an image");
	}
}

package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
	public static void main(String[] args) {
		VideoProcessorTask[] tasks = {
			new VideoProcessorTask("Bank"),
			new VideoProcessorTask("School"),
			new VideoProcessorTask("Conference"),
			new VideoProcessorTask("HomeSecurity")
		};
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
		
		for(VideoProcessorTask vp:tasks) {
			newFixedThreadPool.submit(vp);
		}
		
		newFixedThreadPool.shutdown();
	}
}


class VideoProcessorTask implements Runnable{
	String sourceName;
	
	public VideoProcessorTask(String source) {
		this.sourceName=source;
	}
	
	public void run() {
		Utils.printmessage("Processing video from "+sourceName+" started...");
		try {
			Thread.sleep(3000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("Processing video from "+ sourceName +" ended...");
	}
}
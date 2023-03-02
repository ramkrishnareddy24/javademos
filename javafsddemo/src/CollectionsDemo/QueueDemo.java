package CollectionsDemo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		
		System.out.println(q.peek());
		
		Random r = new Random();
		for(int i=1;i<=10;i++) {
			q.offer(r.nextInt(1,10));
		}
		
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.remove());
		System.out.println(q);
	}
}

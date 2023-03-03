package Threads;

import java.util.Scanner;

public class ThreadDemo2 {
	public static void main(String[] args) {
		
		
		
		printmessage("Sum of first N numbers");
		printmessage("Enter a value");
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		long starttime = System.currentTimeMillis();
		
		Calculator c = new Calculator(n);
		c.start();
		
		try {
			c.join();
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		printmessage("Sum of first "+n+" numbers = "+c.getSum());
		long endtime = System.currentTimeMillis();
		System.out.println("Total time taken = "+(endtime-starttime));
		
	}

	private static void printmessage(String string) {
		System.out.println(Thread.currentThread().getName()+"-"+string);
	}
}

class Calculator extends Thread{
	int n;
	int sum;
	
	Calculator(int n){
		this.n=n;
	}
	
	public void run() {
		for(int i=1;i<=n;i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getSum() {
		return sum;
	}
}

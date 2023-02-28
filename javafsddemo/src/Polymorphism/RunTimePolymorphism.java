package Polymorphism;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		MacBook m = new MacBook();
		m.start();
		m.shutdown();
		
		MacBook mA = new MacBookAir();
		mA.start();
		mA.shutdown();
	}
}

class MacBook{
	void start() {
		System.out.println("MacBook Started...");
	}
	
	void shutdown() {
		System.out.println("MacBook Shutdown...");
	}
}

class MacBookAir extends MacBook{
	void start() {
		System.out.println("MacBookAir Started...");
	}
	
	void shutdown() {
		System.out.println("MacBookAir Shutdown...");
	}
}


class MacBookPro extends MacBook{
	void start() {
		System.out.println("MacBookPro Started...");
	}
	
	void shutdown() {
		System.out.println("MacBookPro Shutdown...");
	}
}


package abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {
		BMWThreeSeries b3 = new BMWThreeSeries();
		b3.start();
		b3.accelerate();
		
		BMWFiveSeries b4 = new BMWFiveSeries();
		b4.start();
		b4.accelerate();
		
		BMW b0 = new BMWThreeSeries();
		b0.start();
		b0.accelerate();
		
	}
}

abstract class BMW{
	void start() {
		System.out.println("BMW Started");
	}
	
	abstract void accelerate();
}


class BMWThreeSeries extends BMW{
	void accelerate() {
		System.out.println("Three times acceleration...");
	}
}

class BMWFiveSeries extends BMW{
	void accelerate() {
		System.out.println("Five times acceleration...");
	}
}
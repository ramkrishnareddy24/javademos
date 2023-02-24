package inheritance;

public class Heirarchical {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.fuel();
		Bus b = new Bus();
		b.fuel();
		Bike bi = new Bike();
		bi.fuel();
	}
}

class Vehicle{
	void fuel() {
		System.out.println("Petrol");
	}
}

class Bus extends Vehicle{
	void fuel() {
		System.out.println("CNG");
	}
}

class Car extends Vehicle{
	void fuel() {
		System.out.println("Diesel");
	}
}

class Bike extends Vehicle{
	
}



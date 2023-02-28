package Encapuslation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.getNumOfWheels());
		System.out.println(c.getColor());
		
	}
}

class Car{
	int numOfWheels;
	String color;
	boolean customizable;
	
	Car(){
		numOfWheels=4;
		color="White";
		customizable=false;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		if(customizable)
		this.numOfWheels = numOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(customizable)
		this.color = color;
	}
}

package InnerClass;

public class InnerClassDemo {
	public static void main(String[] args) {
		ElectronicDevice.powerOn();
		
		ElectronicDevice.Chip.displayBrand();
		
		ElectronicDevice.Chip chip = new ElectronicDevice.Chip();
		chip.specs();
		
		ElectronicDevice laptop = new ElectronicDevice();
		laptop.powerOn();
		
		ElectronicDevice.Processor proc = laptop.new Processor();
		proc.getVoltage();
		
		ElectronicDevice.Processor.displayProcBrand();
		
	}
}

class ElectronicDevice{
	static void powerOn() {
		System.out.println("Device powered on...");
	}
	
	static class Chip{
		static void displayBrand() {
			System.out.println("From Sony...");
		}
		
		void specs() {
			System.out.println("Specifications for chip...");
		}
	}
	
	class Processor{
		void getVoltage() {
			System.out.println("Display voltage on the processor...");
		}
		
		static void displayProcBrand() {
			System.out.println("Processor brand displayed...");
		}
	}
}

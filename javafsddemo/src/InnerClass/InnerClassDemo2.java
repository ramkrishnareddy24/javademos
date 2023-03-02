package InnerClass;

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Car car = new Car("Blue");
		car.start();
		
		Car.MusicSystem ms = car.new MusicSystem(8);
		ms.displayDetails();
		ms.playSomeMusic();
	}
}

class Car{
	private static String model = "Hyundai I20 Automatic";
	private String color;
	
	void start() {
		System.out.println("Car with "+color+" color is starting..");
	}
	Car(String color){
		this.color=color;
	}
	
	class MusicSystem{
		private int numOfChannels;
		
		MusicSystem(int num){
			this.numOfChannels=num;
		}
		
		void displayDetails() {
			System.out.println("Model of the car :"+Car.model);
			System.out.println("The color of the car :"+Car.this.color);
			System.out.println("Num of Channels in MusicSystem :"+this.numOfChannels);
		}
		
		void playSomeMusic() {
			System.out.println("Playing some music...");
			
			class Channel{
				int frequency;
				void getCurrentPlayingSong() {
					System.out.println("Displaying current playing song");
				}
			}
			
			Channel channel = new Channel();
			channel.getCurrentPlayingSong();
		}
		
	}
}

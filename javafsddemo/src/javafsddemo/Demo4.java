package javafsddemo;

public class Demo4 {
	public Demo4()
	{
		System.out.println("From Constructor");
	}
	
	{
		System.out.println("Non Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		Demo4 dem = new Demo4();
	}
}

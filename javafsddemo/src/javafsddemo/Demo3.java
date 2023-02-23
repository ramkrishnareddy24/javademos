package javafsddemo;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Main method");
		method1();
		method2();
		
		Demo3 dem = new Demo3();
		dem.method3();
	}
	
	static void method1() {
		System.out.println("Static method 1");
	}
	
	static void method2() {
		System.out.println("Static method 2");
	}
	
	void method3() {
		System.out.println("Non Static Method");
	}
}

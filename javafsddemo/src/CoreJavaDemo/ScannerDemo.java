package CoreJavaDemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		ScannerDemo2();
	}
	
	private static void ScannerDemo2() {
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			sum+=num;
			System.out.println("Enter number (Char to exit)");
		}
		System.out.println("Sum :"+sum);
	}
	
	private static void ScannerDemo1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id :");
		int id = sc.nextInt();
		
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Student details");
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}
}

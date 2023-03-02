package Exception;

import java.util.*;

public class ExceptionDemo {
	public static void main(String[] args) {
//		AirthematicException();
//		NumberFormat();
		StringOutOBound();

	}

	private static void AirthematicException() {
		int a;
		int b;
		int res;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two Numbers :");
		a = sc.nextInt();
		b = sc.nextInt();

		try {
			res = a / b;
			System.out.println("Result " + res);
		}

		catch (ArithmeticException ae) {
			System.out.println("Ecxeption Occurred :" + ae);
		}
	}

	private static void NumberFormat() {
		String s = "Hello";
		try {
			int i = Integer.parseInt(s);
			System.out.println("Integer " + i);
		} catch (Exception e) {
			System.out.println("Please Enter Valid Integer for Conversion");
		}
	}

	private static void StringOutOBound() {
		String s = null;
		try {

			System.out.println("Length " + s.length());
		} catch (Exception e) {
			System.out.println("You are trying to access null string");
		}
	}

}

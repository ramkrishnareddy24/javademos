package InnerClass;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		PrinterConnection con = PrinterDriver.getConnection();
		con.print();
	}
}

class PrinterDriver{
	static PrinterConnection getConnection() {
		PrinterConnection con = new PrinterConnection() {
			public void print() {
				System.out.println("Printing...");
			}
		};
		return con;
	}
}

interface PrinterConnection{
	void print();
}



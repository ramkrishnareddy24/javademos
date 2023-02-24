package inheritance;

public class JDKdemo {
//	Multilevel Inheritance
	public static void main(String[] args) {
		JDK8 j8 = new JDK8();
	}

}

class JDK6{
	JDK6(){
		System.out.println("Installing JDK6");
	}
}


class JDK7 extends JDK6{
	JDK7(){
		System.out.println("Installing JDK7");
	}
}

class JDK8 extends JDK7{
	JDK8(){
		System.out.println("Installing JDK7");
	}
}


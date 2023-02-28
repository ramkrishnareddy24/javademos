package inheritance;

public class ConstructorChaining {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass(10);
		ChildClass ccc = new ChildClass();
		
	}
}

class SuperClass{
	int x;
	
	SuperClass(){
		System.out.println("No args Super class Constructor");
	}
	
	SuperClass(int x){
		this.x=x;
		System.out.println("One Arg Super Class Constructor");
	}
}

class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("No args ChildClass Constructor");
	}
	
	ChildClass(int y){
		super(y);
		System.out.println("One arg child class constructor");
	}
}

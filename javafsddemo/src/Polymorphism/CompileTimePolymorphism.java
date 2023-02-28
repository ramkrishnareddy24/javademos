package Polymorphism;

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		compileTime c = new compileTime();
		c.add(2,3);
		c.add(1.25f, 2.25f);
		c.add(2,3,5);
		
	}
}


class compileTime{
	void add(int a,int b)
	{
		int res=a+b;
		System.out.println("Add 2 Int "+res);
	}
	
	void add(float a,float b)
	{
		float res = a+b;
		System.out.println("Add 2 Float "+res);
	}
	
	void add(int a,int b,int c)
	{
		int res = a+b+c;
		System.out.println("Add 3 Int "+res);
	}
	
}
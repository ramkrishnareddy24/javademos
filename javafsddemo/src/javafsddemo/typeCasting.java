package javafsddemo;

public class typeCasting {
	public static void main(String[] args) {
		byte b = 100;
		int a = 65;
		
		b = (byte) a;
		System.out.println(b);
		
		long l=a;
		
		char ch = 'a';
		System.out.println(ch);
		
		int x = ch;
		System.out.println(x);
		
		
		int y=119;
		char z = (char)y;
		System.out.println(z);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		int a1=10;
		int b1=20;
		
		int res = (a1<b1)?a1:b1;
		System.out.println(res);
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				sum+=i;		
			
		}
	}
}

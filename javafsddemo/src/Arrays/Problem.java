package Arrays;

public class Problem {
	public static void main(String[] args) {
		int arr[]= {3,5,4,5,7,6,3,5};
		
		function(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void function(int arr[]) {
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]==5 && arr[i-1]==3)
				arr[i]=0;
		}
	}
	
	public static int sumOfEven(int arr[]) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum+=arr[i];
		}
		
		return sum;
		
	}
	
	public static void reverseStr(String str) {
		
		int n=str.length();
		int lo=0,hi=str.charAt(n-1);
		
		while(lo<hi) {
//			swap(str.charAt(lo),str.charAt(hi));
			lo++;
			hi--;
		}
	}
}

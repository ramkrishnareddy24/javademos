package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++)
			arr.add(i);
		
		
		System.out.println(arr);
		
		// set position 3 by 101
		arr.set(3,101);
		
		System.out.println(arr);
		
		// remove value from pos 2
		arr.remove(2);
		System.out.println(arr);
		
//		search a val in list
		boolean c = arr.contains(1);
		System.out.println(c);
		
	}
}

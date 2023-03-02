package CollectionsDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoHashsetTreeset {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>(new StringComparator());
		s.add("Max");
		s.add("Jhon");
		s.add("Willian");
		s.add("Zoe");
		s.add("Robert");
		
		
		System.out.println(s);
	}
}

class StringComparator implements Comparator<String> {
	public int compare(String s1,String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2){
			return 1;
		}
		else {
			return s1.compareTo(s2);
	}
	}
}

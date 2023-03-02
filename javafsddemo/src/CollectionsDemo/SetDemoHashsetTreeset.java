package CollectionsDemo;

import java.io.Serializable;
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
		
		Set<Employee> s1 = new TreeSet<Employee>(new EmployeeCompartor());
		s1.add(new Employee(101,"Ram",10000,"AA101"));
		s1.add(new Employee(102,"Shyam",20000,"AA102"));
		s1.add(new Employee(103,"Murali",3000,"AA103"));
		System.out.println(s1);
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

class EmployeeCompartor implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class Employee {
	int id;
	String name;
	double salary;
	String aadharno;
	
	Employee(int id,String name,double salary,String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadharno=aadharno;
	}
	
	public String toString() {
		return this.id + "|" + this.name +"|"+ this.salary +"|"+ this.aadharno;
	}
}

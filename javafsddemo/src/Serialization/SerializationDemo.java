package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	public static void main(String[] args) {
//		Employee e = new Employee(1,"Max",10000,"AA101");
//		System.out.println(e);
		
		Serialization();
		Deserialization();
		
	}
//	
	private static void Deserialization(){
//		try-with-block
		try(FileInputStream fis = new FileInputStream("C:\\Users\\rkannari\\File\\emp.txt"); ObjectInputStream ois = new ObjectInputStream(fis);){
			
			Employee emp = (Employee)ois.readObject();
			System.out.println("Object Deserialized" + emp);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void Serialization(){
//		try-with-block
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\rkannari\\File\\emp.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			Employee emp1 = new Employee(1,"Max Fuller",8000,"PQ101");
			oos.writeObject(emp1);
			System.out.println("Object serialized");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}



class Employee implements Serializable{
	int id;
	String name;
	double salary;
	String aadharno;
	
	Employee(int id,String name,double salary,String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public String toString() {
		return this.id + "|" + this.name +"|"+ this.salary +"|"+ this.aadharno;
	}
}

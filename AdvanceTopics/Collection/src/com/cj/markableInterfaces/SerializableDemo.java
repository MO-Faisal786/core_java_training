package com.cj.markableInterfaces;

import java.io.*;

public class SerializableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ========Serializable Demo=======
		FileOutputStream fos = new FileOutputStream("test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee("Faisal", 101);
		oos.writeObject(emp);
		System.out.println("Employee object is converted...");
		
		// ========de-Serializable Demo=======
//		FileInputStream fis = new FileInputStream("test.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		Object obj = ois.readObject(); // upcast 
//		Employee emp = (Employee) obj; //downcast
//		System.out.println("Employee text is converted..."+emp);
	}
}

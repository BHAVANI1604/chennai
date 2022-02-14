package com.switchex.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Student1 {

	public static void main(String[] args) {
		try {
			Student s=new Student("bhavani",101);
			FileOutputStream f=new FileOutputStream("E:\\pen.txt");
			ObjectOutputStream o=new ObjectOutputStream(f);
			o.writeObject(o);
			o.flush();
			o.close();
			System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}

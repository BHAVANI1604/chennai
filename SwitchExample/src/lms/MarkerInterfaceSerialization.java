package lms;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MarkerInterfaceSerialization implements Serializable {
	int i;
	String s;
	public MarkerInterfaceSerialization(int i, String s) {
		this.i=i;
		this.s=s;
		
	}
	public static void main(String[] args) {
		MarkerInterfaceSerialization mis=new MarkerInterfaceSerialization(65,"test");
		
		
	}

}

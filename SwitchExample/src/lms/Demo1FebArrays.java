package lms;

import java.util.Arrays;
import java.util.List;

public class Demo1FebArrays {

	public static void main(String[] args) {
		String[] a= {"bhavani","prakash"};
		List<String>li=Arrays.asList(a);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}

	}

}

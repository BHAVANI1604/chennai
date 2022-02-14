package lms;

import java.util.concurrent.ConcurrentHashMap;

public class FruitConcurrent {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String>chmap=new ConcurrentHashMap<Integer, String>();
		chmap.put(1, "apple");
		chmap.put(2, "banana");
		chmap.put(3, "graps");
		
		chmap.forEach((k,v)->System.out.println(k+""+v));
		
		for(Integer id:chmap.keySet()) {
			String name=chmap.get(id);
			System.out.println(id+" "+name);
			
		}
		for(String name:chmap.values()) {
			System.out.println(name);
		}
		for(Integer id:chmap.keySet()) {
			System.out.println(id);
		}

	}

}

package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseTv {

	public static void main(String[] args) {
		Tv t=new Tv("samsung", 17, 100000);
		Tv t1=new Tv("sony", 23, 1000000);
		ArrayList<Tv>l=new ArrayList<Tv>();
		l.add(t);
		l.add(t1);
		List<Tv>l1=l.stream().filter(a->a.getBrand().equalsIgnoreCase("samsung")).collect(Collectors.toList());
		Iterator<Tv>i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	//	long l2=l.stream().map(b->b.getSize()>17).count(); 
	//	System.out.println(l2);
//		for(Tv v:l2) {    Long li5=li.stream().filter(a->a.getId()>=1).collect(Collectors.counting());
//			System.out.println(v);
//		}
//		
		Long l2=l1.stream().filter(b->b.getPrice()>10000).collect(Collectors.counting());
		System.out.println(l2);

	}

}

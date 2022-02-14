package lms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseProduct {

	public static void main(String[] args) {
		Product p=new Product(1, "hp", 2300f);
		Product p1=new Product(3, "lenova", 230009f);
		Product p2=new Product(4, "dell", 240000f);
		ArrayList<Product>li=new ArrayList<Product>();
		li.add(p);
		li.add(p1);
		li.add(p2);
		List<Product>l1=li.stream().filter(a->a.name.equalsIgnoreCase("lenova")).collect(Collectors.toList());
		for(Product a: l1) {
			System.out.println(a);
		}
		List<Integer> l2=li.stream().map(b->b.id).collect(Collectors.toList());
		System.out.println(l2);
		long l3=l2.stream().count();
		System.out.println(l3);
		
		Map<Integer, String>m=l1.stream().collect(Collectors.toMap(Product::getId,Product::getName,
		(x,y)->x+" ,"+y));
		System.out.println(m);
//	Map<Integer, String> map = li.stream()  .collect( Collectors .toMap( Product::getId, Product
//			::getName, (x, y) -> x + ", " + y, 	Map::new));
		
		m.forEach((x,y)->System.out.println(x+","+y));

	}

}

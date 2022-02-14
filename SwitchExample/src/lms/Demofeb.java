package lms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demofeb {

	public static void main(String[] args) {
		Stream<String> li=Stream.of("hai","hello","how","what");
		List<String>list=li.collect(Collectors.toList());
		System.out.println(list);
	for(String a:list) {
			System.out.println(a);
		}

	}

}

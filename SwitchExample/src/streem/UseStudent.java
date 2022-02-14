package streem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		
		Student s=new Student("bhavani",1,10000);
		Student s1=new Student("prakash",2,25000);
		Student s3=new Student("dahjkjl",3,25000);
		Student s4=new Student("anuu",4,24000);
		List<Student>li=new ArrayList<Student>();
		li.add(s);
		li.add(s1);
		li.add(s3);
		li.add(s4);
		List<Student>li1=li.stream().filter(f->f.getFee()>10000).collect(Collectors.toList());
		System.out.println(li1);
		
		List<Student>li2=li.stream().filter(i->i.getId()<=1).collect(Collectors.toList());
		System.out.println(li2);
		List<String>li3=Arrays.asList("bhavani","satya","kakinada");
		List<String>li4=li3.stream().filter(str->str.length()<6).collect(Collectors.toList());
		System.out.println(li4);
		
		Long li5=li.stream().filter(a->a.getId()>=1).collect(Collectors.counting());
		System.out.println(li5);
		Set<Student>li6=li.stream().filter(a1->a1.getFee()>=25000).collect(Collectors.toSet());
		System.out.println(li6);
		
	}

}

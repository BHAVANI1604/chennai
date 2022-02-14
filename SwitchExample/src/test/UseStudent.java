package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("bhavani",1,"kkd","cse",16);
		Student s2=new Student("anu",2,"rcp","ece",17);
		Student s3=new Student("satya",3,"aml","mech",18);
		Student s4=new Student("bhavanianu",4,"kkd2","civil",19);
		ArrayList<Student>li=new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		List<Student>li1=li.stream().filter(a->a.getDept().equalsIgnoreCase("cse")).collect(Collectors.toList());
		//System.out.println(li1);
		li1.forEach(b->System.out.println(b));
		
//		List<Boolean>l=li.stream().map(a->a.getId()>2).collect(Collectors.toList());
//	
//	for(Boolean ss:l) {
//		System.out.println(ss);
//	}
	// long c=l.stream().count();
//	System.out.println(c);
	long li5=li.stream().map(x->x.getDob()>18).count();
	System.out.println(li5);
	
	
//	for(Student ss:li) {
//		System.out.println(ss);
//	}

	}


}
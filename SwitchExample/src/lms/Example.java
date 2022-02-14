package lms;

public class Example {

	public static void main(String[] args) {
		Sayable s=()->{ 
			
			return "hi";
		};
		System.out.println(s.say());
		
		
		Sayable1 s1=(name)->{
			return "Hello"+name;
		};
		System.out.println(s1.say("nhjbgf"));
		
		Addable ad2=(a,b)->(a+b);
		System.out.println(ad2.add(10, 20));
		
		

	}

}

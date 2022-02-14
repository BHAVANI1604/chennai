package lms;

public class Feb8Q1 {
    static int num;
    static String name;
    static{
    	System.out.println("static 1");
    	num=20;
    	name="static 1";
    }
    static {
    	System.out.println("static 2");
    	num=20;
    	name="static 2";
    }
	public static void main(String[] args) {
		System.out.println(num);
		System.out.println(name);

	}

}

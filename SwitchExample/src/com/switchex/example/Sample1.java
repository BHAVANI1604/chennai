package com.switchex.example;

public class Sample1 {
int a=10;
static int b=10;
void add() {
	int c=10;
	a++;
	b++;
	c++;
	System.out.println(c);
}
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
		Sample1 s3=new Sample1();
		s1.add();
		s1.add();
		s1.add();
		System.out.println(s1.a+" "+b);
		s2.add();
		s2.add();
		s2.add();
		System.out.println(s2.a+" "+b);
		s3.add();
		s3.add();
		s3.add();
		System.out.println(s3.a+" "+b);
		

	}

}

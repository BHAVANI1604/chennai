package lms;

public class FebQ4  implements Cloneable{
	int i;
	String name;
	public FebQ4(int i,String name) {
		this.i=i;
		this.name=name;
		
	}
//	protected Object clone()
//	        throws CloneNotSupportedException
//	    {
//	        return super.clone();
//	    }
	
	public static void main(String[] args)throws CloneNotSupportedException{
		FebQ4 a=new FebQ4(10,"hi"); 
		FebQ4 b=(FebQ4)a.clone();
		System.out.println(b.i);
		System.out.println(b.name);
	}

}

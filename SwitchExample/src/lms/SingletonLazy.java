package lms;

public class SingletonLazy {
	private static SingletonLazy single=null;
     private SingletonLazy() {
    	 
     }
     public static SingletonLazy getInstance() {
    	 if(single==null)
    		 single=new SingletonLazy();
    	 return single;
     }
	public static void main(String[] args) {
		SingletonLazy x=SingletonLazy.getInstance();
		SingletonLazy y=SingletonLazy.getInstance();
		if(x==y) {
			System.out.println("two objects points same menory");
		}
		else {
			System.out.println("two objects points different menory");
		}

	}

}

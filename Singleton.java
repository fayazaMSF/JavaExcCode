package inter;

public class Singleton {
	private static Singleton singleton=new Singleton();
	
	private Singleton(){		
	};
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public void test(){
		System.out.println("its working");
	}
/*public static void main (String [] args){
	Singleton s= getInstance();
	s.test();
	Singleton s2= getInstance();
	s2.test();
}*/
}

package inter;

public class SingletonTest {
	public static void main (String [] args){
	//	Singleton s0= new Singleton();
		Singleton s=Singleton.getInstance();
		s.test();
		Singleton s2=Singleton.getInstance();
		s2.test();
		if(s==s2){
			System.out.println("test succ");
		}
	}

}

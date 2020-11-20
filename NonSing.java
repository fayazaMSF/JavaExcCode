package inter;

public class NonSing {
	public void test(){
		System.out.println("fine");
		
		
	}
public static void main (String [] args){
	 NonSing s= new NonSing();
	 NonSing s2= new NonSing();
	 if(s==s2){
			System.out.println("test succ");
		}
	 else {
		 System.out.println("i got it");
	 }
}
}

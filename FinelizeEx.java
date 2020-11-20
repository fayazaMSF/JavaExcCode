package inter;
import java.util.*;

public class FinelizeEx {

	public void add(){
		   System.out.println("ffms");

	   }
	   public static void main(String[] args) throws CloneNotSupportedException {

		   FinelizeEx cal = new FinelizeEx();
		   
	   try {
	   // create a new ObjectDemo object
	 

	   // print current time
	   System.out.println("ffms");

	   // finalize cal
	   System.out.println("Finalizing...");
	   cal.finalize();
	   System.out.println("Finalized.");

	   } catch (Throwable ex) {
	   ex.printStackTrace();
	   }
       
	   cal.add();   }
	}



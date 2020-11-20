package inter;

	public class ThreadDemo implements Runnable {

	   ThreadDemo() {
	   // main thread
	   Thread currThread = Thread.currentThread();
	   // thread created
	   Thread t = new Thread(this, "Admin Thread");
	   Thread t1 = new Thread(this.test(), "test Thread");
	   System.out.println("current thread = " + currThread);
	   System.out.println("thread created = " + t);
	   System.out.println("ttest created = " + t1);
	   // this will call run() function
	   t.start();
	   
	   }

	   public void run() {
	   System.out.println("This is run() method");
	   }
	   public static ThreadGroup test(){
		   System.out.println("This is method");
		return null;
	   }
	   public static void main(String args[]) {
	   new ThreadDemo();
	   }
	} 

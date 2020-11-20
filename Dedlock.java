package inter;

public class Dedlock {
	String res="faathima";
	String res2="fayaza";
	
	Thread t1= new Thread(){
		public void run(){
			while(true){
				synchronized(res){
					try {

						Thread.sleep(10000);

						} catch (InterruptedException e) {

						// TODO Auto-generated catch block

						e.printStackTrace();}
					
					synchronized(res2){
						System.out.println(res+res2);
					}
					
				} 
			}
			
		}
		
	};
	
	Thread t2= new Thread(){
		public void run(){
			while(true){
				synchronized(res2){
					try {

						Thread.sleep(10000);

						} catch (InterruptedException e) {

						// TODO Auto-generated catch block

						e.printStackTrace();} 
					synchronized(res){
						System.out.println(res2+res);
					}
					
				}
			}
		}
	};

	public static void main(String [] args){
		Dedlock d= new Dedlock();
		d.t1.start();
		d.t2.start();
	}
}

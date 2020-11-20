package inter;

public class PerectNum {
	public void perfect(int num){
		int temp=0;
		for(int i=1; i<=num/2;i++){
			if(num%i==0){
				temp=temp+i;
			}
			
		}
		if (temp==num){
			System.out.print("perfectNum");
		}
		else{
			System.out.println("not perect");
		}
		
	}
	public static void main(String [] args){
		PerectNum p= new PerectNum();
		p.perfect(6);
	}
}

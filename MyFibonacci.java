package inter;

public class MyFibonacci {
	public static void main(String []args){
		int []feb=new int[20];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<=feb.length-1;i++){
		feb[i]=feb[i-1]+feb[i-2];
			System.out.print(feb[i]+",");
		}
	}
}

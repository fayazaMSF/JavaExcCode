package inter;

public class ReversNum {
	public int reverseNum(int num){
		int rev=0;
		while(num>0){
			int a =num%10;
			
			rev=(rev*10)+a;
			num=num/10;
		}
		return rev;
	}
public static void main (String []args){
	ReversNum r=new ReversNum();
	System.out.print(r.reverseNum(567));
}
}

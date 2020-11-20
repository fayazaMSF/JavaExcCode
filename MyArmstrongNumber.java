package inter;

public class MyArmstrongNumber {
	public static void main(String args[]){
		int sum=0;
		int num=153;
		while(num>0){
			int a=num%10;
			sum+=a*a*a;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}

package inter;

public class DecimalToBinery {
	public void deciToBin(int num){
		int [] numArr=new int[25];
		int i=0;
		while(num>0){
			
			numArr[i++]=num%2;
			num=num/2;
			
		}
		for(int j=numArr.length-1; j>=0;j--){
			System.out.print(numArr[j]);
		}
		
	} 
	
	public static void main(String []args){
		DecimalToBinery db= new DecimalToBinery();
		db.deciToBin(12);
		
	}

}

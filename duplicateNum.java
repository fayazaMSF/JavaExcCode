package inter;

public class duplicateNum {

	public static void main (String [] args){
		
	int []num={1,2,3,4,5,6,7,8,9,1};
	
		for(int i=0; i<num.length; i++){
			for(int j=i+1; j<num.length; j++){
				if(num[i]==num[j]){
					System.out.print(num[i]);
				}
			
				
			}
		}
	}
}

package inter;

public class FindMidIndex {
	public static int findMidintex(int [] num) throws Exception{
		int sratIndex=0;
		int endIndex=num.length-1;
		int rightSum=0;
		int leftSum=0;
		while(true){
			if(rightSum > leftSum){
				leftSum=leftSum+num[sratIndex++];
			}
			else{
				rightSum=rightSum+num[sratIndex++];
			}
			if(sratIndex>endIndex){
			if (rightSum == leftSum) {
                break;
            } else {
                throw new Exception(
                        "Please pass proper array to match the requirement");
            }
		}
			
		}
		
		return endIndex-1;
	}
	
	public static void main(String [] args){
		int[] num = { 2, 4, 4, 5, 4, 1,9 };
		try {
			System.out.println("Starting from index 0, adding numbers till index "+ findMidintex(num) + " and");
			System.out.println("adding rest of the numbers can be equal");
			} catch (Exception ex) {
				System.out.println(ex.getMessage());}
	}

}

package inter;

public class RotateArray {
	public static void main(String [] args){
		int[] arr={1,2,3,4,5,6};
		int order=1;
		RotateArray.rotate(arr, order);
		
	}
	public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i]);
			
			
		}
	}

}

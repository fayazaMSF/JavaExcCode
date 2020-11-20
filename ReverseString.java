package inter;

public class ReverseString {
	String revers="";
	
	public String reverse(String start){
		if(start.length()==1){
			return start;
		}
		else{
			revers=start.charAt(start.length()-1)+reverse(start.substring(0, start.length()-1));
		
			return revers;
		}	
		
	}
	
	public static void main(String [] args){
		ReverseString rs= new ReverseString();
		System.out.println(rs.reverse("faathima"));
		
	}

}

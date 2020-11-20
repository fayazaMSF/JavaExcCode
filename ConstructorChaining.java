package inter;
/*Calling another constructor in 
 * the same class from another constructor is called constructor chaining.
 *  By using this() we can call another constructor in the same class. Incase 
 * we want to call another constructor, this() should be the first line in the constructor*/
public class ConstructorChaining {
	
	    public ConstructorChaining(){
	        System.out.println("In default constructor...");
	    }
	    public ConstructorChaining(int i){
	        this();
	        System.out.println("In single parameter constructor...");
	    }
	    public ConstructorChaining(int i,int j){
	        this(j);
	        System.out.println("In double parameter constructor...");
	    }
	     
	    public static void main(String a[]){
	    	ConstructorChaining ch = new ConstructorChaining(10,20);
	    }
}
package inter;
/*onstructor is chaining is the process of calling another constructor
 *  in same class or parent class. To call
 *  constructor in the same class use this() and to call parent class constructor use super()
 */

public class Toyota extends Car {

	Toyota() {
		this("Java Honk");

	}

	Toyota(String name) {
		super();
		System.out.println(name);
	}

	public static void main(String args[]) {
		new Toyota();

	}

}

class Car {

	Car() {
		System.out.println("Car parent class");
	}
}



package inter;


	class Animal {
		  void eat() {
		    System.out.println("animal : eat");
		  }
		}

		class Dog extends Animal {
		  void eat() {
		    System.out.println("dog : eat");
		  }
		  void anotherEat() {
		    super.eat();
		  }
		  void anotherEat1() {
			    this.eat();
			  }
		}

		public class Sup {
		  public static void main(String[] args) {
		    Animal a = new Animal();
		    a.eat();
		    Dog d = new Dog();
		    d.eat();
		    d.anotherEat();
		    d.anotherEat1();
		  }
		}
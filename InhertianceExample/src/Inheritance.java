
//so there are 3 types of inheritance 
//single inhertiance --> inhertiate from one class. 
//multilevel inheritance --> inhetiatance from multiple classes
//Single Inheritance.
//Multiple Inheritance (Through Interface)
//Multilevel Inheritance.
////Hierarchical Inheritance.
////Hybrid Inheritance (Through Interface)
//base class or parent class and child class ot middle class are the terminology 


public class Inheritance {

	
	
	public static void main(String[] args) {
		
		cat c = new cat();
		dog d = new dog();
		Babydog scobby = new Babydog();
		kitten pussycat = new kitten();
		c.eat();
		c.poop();
		c.sound();
		d.eat();
		d.poop();
		d.sound();
		scobby.eat();
		scobby.poop();
		scobby.sound();
		pussycat.eat();
		pussycat.poop();
		pussycat.sound();
		
	}
	
	
	
}

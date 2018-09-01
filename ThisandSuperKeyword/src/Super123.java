//
//Super Key word: 
//	
//	1.) the super keyword is used for accessing parent class instance members ( intannce variable and instance methods ) and constructors.
//    2.) The super keyword can be specified either in child class constructors or child class instance methods. 
//    3.) the super keyword cannot be specified in child class static methods. 

public class Super123 {

	int person = 100;

	Super123() {

		int person = 100;
		int hello = this.person = 101;

		System.out.println("parent class constructor" + person);
		System.out.println("parent class" + hello);

	}

	void Super123() {
		System.out.println("super class method");
	}

}

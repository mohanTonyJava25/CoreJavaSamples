
//
//Super Key word: 
//	
//	1.) the super keyword is used for accessing parent class instance members ( instance variable and instance methods ) and constructors.
//    2.) The super keyword can be specified either in child class constructors or child class instance methods. 
//    3.) the super keyword cannot be specified in child class static methods. 

public class Sub123 extends Super123 {

	Sub123(){
		
		
		super(); // it calls and excute the super class constructor. it should be first line in the child constrtuctor.
		
		// this is no need because JVM by default calls and excute the parent constructor once you instantiate the sub class. 
		
		System.out.println("This is this in the  child class constrtucotr");
	}
	
	
	void sub123() {

		int num = super.person;

		System.out.println("sub class method" + num);

		super.Super123(); // we are using the child method with out instancing it. 

	}

	public static void main(String[] args) {

		Sub123 sub = new Sub123();

		sub.Super123(); ///calling the super class method with out the instancing it. 
		sub.sub123();

	}

}

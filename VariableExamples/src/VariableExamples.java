//
// there are three types of variables.
//
// local variable is a varaible which is inside the class and inside a method is called local variable. 

// instance variable is a variable which is inside a class but out side a method is called instance variable.
//  refenece variable represents the class with help of reference varaibel you can represent the method and variables. 
// Static variable is a varaible which is inside a class and out side method with static keyword is called static variable. 
//
public class VariableExamples {

	int x = 45; // instance variable

	static int z = 35;

	public static void main(String[] args) {

		int y = 25; // local variable

		VariableExamples ve = new VariableExamples();

		System.out.println(ve.x);
		// System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
